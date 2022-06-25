
public class Funcionarios {
	/**
	 * TODOS ATRIBUTOS PARA ESTA CLASS CHAMADA DE FUNCIONARIOS.
	 */
	private String nome;
	private String cpf;
	private String email;
	private double salario;
	private static int totalFuncionarios;
	/**
	 * CONSTRUTOR DA CLASS FUNCIONARIO
	 * @param nome TIPO STRING NOME DO FUNCIONARIO.
	 * @param cpf TIPO STRING O CPF DO FUNCIONARIO.
	 * @param salario TIPO DOUBLE O TOTAL DE SALARIO DO FUNCIONARIO.
	 */
	
	public Funcionarios(String nome, String cpf, double salario) {
		this.setCpf(cpf);
		this.setNome(nome);
		this.setSalario(salario);
		totalFuncionarios ++;
		System.out.println("TOTAL DE CONTAS: " + totalFuncionarios);
		
	}
	/**
	 * TODOS METODOS TIPO GET DA REQUISIÇÃO DE FUNCIONARIOS;
	 * @return
	 */
	public String getNome(){
		return this.nome;
	}
	public String getCpf() {
		return this.cpf;
	}
	public String getEmail() {
		return this.email;
	}
	public double getSalario() {
		return this.salario;
	}
	/**
	 * TODOS METODOS SET PARA ATRIBUIR OS ATRIBUTOS DE FUNCIONARIOS;
	 * @param valor : ESTE VALOR È SETADO CONFORME A ATRIBUIÇÃO PARA FUNCIONARIOS:
	 */
	public void setNome(String valor) {
		this.nome = valor;
	}
	public void setEmail(String valor) {
		this.email = valor;
	}
	public void setSalario(double valor) {
		this.salario = valor;
	}
	public void setCpf(String valor) {
		this.cpf = valor;
	}
	/**
	 * METODO QUE RETORNA A BONIFICACAO DE UM FUNCIONARIO;
	 * @return RETORNA O SALARIO x 10% DE BONIFICAÇÃO APLICADA;
	 * 
	 */
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
}
