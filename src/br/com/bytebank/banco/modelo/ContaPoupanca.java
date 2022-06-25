package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	public ContaPoupanca(double saldo, int agencia, int numero, Cliente titular) {
		super(saldo, agencia, numero, titular);
	}
}
