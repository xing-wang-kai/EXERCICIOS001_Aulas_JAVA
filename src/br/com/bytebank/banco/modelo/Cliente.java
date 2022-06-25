package br.com.bytebank.banco.modelo;

public class Cliente {
	public String cpf;
	public String nome;
	public String email;
	public String profissao;
	
	public Cliente(String cpf, String nome, String email, String profissao)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.profissao = profissao;
	}
	
}
