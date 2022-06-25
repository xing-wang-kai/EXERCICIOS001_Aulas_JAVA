package br.com.bytebank.banco.modelo;
/**
 * ESTA CLASS INSTANCIA UM GERENTE ONDE O MEMSO PODE EXTENDER FUNCIONARIO E AUTENTIFICAVEL;
 * @author KAI WANG
 *
 */
public class Gerente extends Funcionarios implements Autenticavel {
	protected String senha;
	/**
	 * NESTE CONSTRUTOR EXISTE HERANCA COM SUPER QUE DEFINE OS METODOS DO PAI
	 * @param nome
	 * @param cpf
	 * @param salario
	 * @param senha
	 */
	public Gerente(String nome, String cpf, double salario, String senha) {
		super( nome, cpf, salario);
		this.setSenha(senha);
	}
	/**
	 * ESTES METODOS COM DECORATOR OVERRIDE INFORMA QUE 
	 * OS METODOS SAO REESCRITOS DA INTERFACE QUE FOI IMPLEMENTADA
	 */
	@Override
	public void setSenha(String valor) {
		this.senha = valor;
	}
	
	@Override
	public boolean autentificar(String senha) {
		if(this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getBonificacao() {
		return super.getSalario() * 1.10; 
	}
	
}
