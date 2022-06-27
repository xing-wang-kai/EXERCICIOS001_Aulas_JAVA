package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.GuardarConta;
import br.com.bytebank.banco.modelo.*;

/**
 * NESSE EXERCICIOS DE TESTE A CONTA SERA ESPANDIADA CONFORME A NECESSIDADE, CRIANDO ASSIM UM ARRAY QUE PODE RECEBER VALORES INCALCULAVEIS.
 * @author KAI WANG;
 *
 */
public class TesteGuardaContas {
	public static void main(String[] args) {
		GuardarConta arrayContas = new GuardarConta();
		Cliente Paula = new Cliente("111.111.111-11", "Paula Silvestre",  "email@email.com.br", "Programadora");
		Conta cc1 = new Conta(1200.00, 123, 123456, Paula);
		
		Cliente Ariana = new Cliente("222.222.222-22", "Ariana de souza",  "email@email.com.br", "SEO");
		Conta cc2 = new Conta(2000.00, 123, 123456, Ariana);
		
		Cliente Thiago = new Cliente("333.333.333-33", "Thiago Barbosa",  "email@email.com.br", "SEO");
		Conta cc3 = new Conta(2000.00, 123, 123456, Thiago);
		
		Cliente America = new Cliente("444.444.444-44", "America Luiza",  "email@email.com.br", "Biologa");
		Conta cc4 = new Conta(2000.00, 123, 123456, America);
		
		Cliente Jessica = new Cliente("555.555.555-55", "Jessica Morato",  "email@email.com.br", "Tecnica de informática");
		Conta cc5 = new Conta(2000.00, 123, 123456, Jessica);
		
		arrayContas.adicionarConta(cc1);
		arrayContas.adicionarConta(cc2);
		arrayContas.adicionarConta(cc3);
		arrayContas.adicionarConta(cc4);
		arrayContas.adicionarConta(cc5);
		
		arrayContas.totalConta();
		Conta ref1 = (Conta) arrayContas.getConta(0);
		Conta ref2 = (Conta) arrayContas.getConta(1);
		Conta ref3 = (Conta) arrayContas.getConta(2);
		Conta ref4 = (Conta) arrayContas.getConta(3);
		Conta ref5 = (Conta) arrayContas.getConta(4);
		
		System.out.println("Conta1: " + ref1.titular.nome);
		System.out.println("Conta2: " + ref2.titular.nome);
		System.out.println("Conta3: " + ref3.titular.nome);
		System.out.println("Conta4: " + ref4.titular.nome);
		System.out.println("Conta5: " + ref5.titular.nome);
		
		int[] arrayNumeros = {4, 5, 6, 7, 8, 10};
		
		for(Object item: arrayNumeros) {
			System.out.println(item);
		}
		
	}
}
