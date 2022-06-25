package br.com.bytebank.banco.modelo;
/**
 * ESTA CLASS E O SISTEMA INTERNO QUE VERIFICA TODOS USUARIOS QUE TEM A INTERFACE AUTENTIFICAVEL INCLUIDAS NO SEU CORPO PARA ASSIM PODEREM ENTRAR NO SISTEMA INTERNO.
 * @author KAI WANG
 *
 */
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
