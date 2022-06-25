package br.com.bytebank.banco.modelo;

public abstract interface Autenticavel {
	public abstract void setSenha(String valor);
	
	public abstract boolean autentificar(String senha);
}
