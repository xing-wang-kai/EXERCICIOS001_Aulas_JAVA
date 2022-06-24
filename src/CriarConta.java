
public class CriarConta {
	public static void main(String[] args)
	{
		
		Cliente Paula = new Cliente();
		Paula.nome = "Paula de souza";
		Paula.cpf = "111.111.111-111";
		Paula.email = "paula@email.com.br";
		Paula.profissao = "programadora";
		
		Conta conta1 = new Conta(200, 12345, 3333333, Paula);
		
		Cliente Veronica = new Cliente();
		Veronica.nome = "veronica da silva souza";
		Veronica.cpf = "222.222.222-222";
		Veronica.profissao = "Dona de Casa";
		Veronica.email = "veronica@email.com.br";
		
		Conta conta2 = new Conta(300, 123434, 44444, Veronica);
		
		
		System.out.println("conta1 saldo: " + conta1.getSaldo());
		System.out.println("conta1 agencia: " + conta1.agencia);
		System.out.println("conta1 numero: " + conta1.numero);
		System.out.println("conta1 Titula: " + conta1.titular);
		System.out.println("conta1 conta: " +  conta1);
		
		System.out.println("conta2 saldo: " + conta2.getSaldo());
		System.out.println("conta2 agencia: " + conta2.agencia);
		System.out.println("conta2 numero: " + conta2.numero);
		System.out.println("conta2 Titula: " + conta2.titular);
		System.out.println("conta2 conta: " +  conta2);
		
		conta1.depositar(100);
		conta2.sacar(20);
		conta1.transferir(100, conta2);
		
		System.out.println("novo saldo conta1 : " + conta1.getSaldo());
		System.out.println("novo saldo conta2 : " + conta2.getSaldo());
		
		/**
		 * conta1 saldo: 200.0
		 * conta1 agencia: 12345
		 * conta1 numero: 55555555
		 * conta1 Titula: Valdinei da Silva Souza
		 * conta1 conta: Conta@76ed5528
		 * conta2 saldo: 300.0
		 * conta2 agencia: 12346
		 * conta2 numero: 123456
		 * conta2 Titula: veronica
		 * conta2 conta: Conta@2c7b84de
		 * novo saldo conta1 : 0.0
		 * novo saldo conta2 : 400.0
		 */
	}
}
