package br.com.bytebank.banco.modelo;

public class SistemaInterno {
	private String senha = "1111";
	
	public void autentificar(Autenticavel auth) {
		boolean autenticou = auth.autentificar(this.senha);
		if(autenticou) {
			System.out.println("LOGOU COM SUCESSO! ");
		}else {
			System.out.println("ACESSO NEGADO!! ");
		}
		
	}
}
