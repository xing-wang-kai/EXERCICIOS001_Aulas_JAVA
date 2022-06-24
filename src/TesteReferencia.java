
public class TesteReferencia {
	public static void main(String[] args)
	{
		/***
		 * Contas possuem a mesma referencias, se por exemplo apontarmos uma nova váriavel 
		 * para conta o retorno da referencia sempre será o mesmo para ambas as contas.
		 */
		
		Conta Conta01 = new Conta(300, 1234, 4444, new Cliente());
		Conta Conta02 = new Conta(300, 1234, 4444, new Cliente());
		
		System.out.println("Ref Conta01: " + Conta01);
		System.out.println("Ref Conta02: " + Conta02);
		
		/**
		 * No exemplo acima as conta 1 e 2 apontam para referencias diferentes do objetos.
		 * ref conta 01 = Conta@5a07e868
		 * ref conta 02 = Conta@76ed5528
		 */
		
		Conta Conta03 = Conta01;
		
		System.out.println("Ref conta03: " + Conta03);
		
		/**
		 * No exemplo acima o código retorna com o mesmo ponteiro para Conta 01, caso seja realizado alguma
		 * alterção será realizada no pontei que está a conta 01 na ref da memória.
		 * ref conta 03 = Conta@5a07e868
		 */
	}
}
