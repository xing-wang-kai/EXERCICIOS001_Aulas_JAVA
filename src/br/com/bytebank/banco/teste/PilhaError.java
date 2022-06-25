package br.com.bytebank.banco.teste;

public class PilhaError {
	public static void main(String[] args) {
		System.out.println("INICIO DO MAIN");
		metodo1();
		System.out.println("FIN DO MAIN");
	}
	public static void metodo1() {
		System.out.println("INICIO DO METODO1");
		metodo2();
		System.out.println("FIN DO METODO1");
	}
	public static void metodo2() {
		System.out.println("INICIO DO METODO1");
			for(int x = 0; x <= 5; x++) {
				
				try {
					int y = x/0;
					System.out.println(y);
					System.out.println("RODADA: " + x);
				}catch(Exception ex){
					System.out.println("ERROR : " + ex.getMessage());
					System.out.println("Cause : " + ex.getCause());
					System.out.println("CLASS : " + ex.getClass());
					System.out.println("STACKTRACE : " + ex.getStackTrace());
					System.out.println("LOCALMESSAGE : " + ex.getLocalizedMessage());
					System.out.println("SUPRESSED : " + ex.getSuppressed());
					
					ArithmeticException exception = new ArithmeticException("DIVISAO POR 0 ");
					throw exception;
				}
				
			} 
		System.out.println("FIN DO METODO1");
	}
}
