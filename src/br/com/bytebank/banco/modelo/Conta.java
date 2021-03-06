package br.com.bytebank.banco.modelo;
/**
 * CLASS QUE INICIA UMA NOVA CONTA COM TODOS METODOS E ATRIBUTOS BASICOS DE UMA CONTA.
 * @author KAI WANG
 *
 */
public class Conta {
	
	private static int totalContas;
	public Conta(double saldo, int agencia, int numero, Cliente titular)
	{
		this.saldo = saldo;
		this.agencia = agencia;
		this.numero = numero;
		this.titular = titular;
		Conta.totalContas++;
		System.out.println(totalContas);
	}
	private double saldo;
	public int agencia;
	public int numero;
	public Cliente titular;
	
	/**
	 * METODOS GETTER E SETTER PARA ACESSAR OS ATRIBUTOS DA CONTA.
	 * @return
	 */
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	public void depositar(double valor)
	{
		this.saldo += valor;
	}
	public boolean sacar(double valor)
	{
		if(this.saldo < valor)
		{
			System.out.println("Não é possivel sacar valores negativos");
			return false;
		}
		else
		{
			this.saldo -=valor;
			return true;
		}
	}
	public void transferir(double valor, Conta conta)
	{
		if(this.sacar(valor)) {
			conta.saldo +=valor;
		}
	}
}
