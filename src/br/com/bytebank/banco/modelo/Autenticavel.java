package br.com.bytebank.banco.modelo;
/**
 * CLASS PARA AUTENTIFICAR USUARIO OU ENTAO O GENRENTE;
 * @author KAI WANG
 *
 */
public abstract interface Autenticavel {
	public abstract void setSenha(String valor);
	
	public abstract boolean autentificar(String senha);
}
