package br.com.bytebank.banco.modelo;

/**
 * CLASS PARA ADICIONAR CONTAS.
 * @author KAI WANG
 *
 */

public class GuardarConta {
	
	private Conta[] referencias;
	private int posicao;
	
	public GuardarConta() {
		this.referencias = new Conta[2];
		this.posicao = 0;
		System.out.println("GuardarConta Criado com sucesso!!");
	}
	/**
	 * ESTA FUNCAO VERIFICA AS CONTAS E O TAMANHO DO ARRAY, SE O TAMANHO DO ARRAY FOR INSUFICIENTE ENTÃO UM NOVO ARRAY SERA 
	 * CONSTRUIDO PARA ADICIONAR O TAMANHO DE CONTA NECESSARIOS, O NOVO ARRAY SEMPRE SERA CHAMADO E CRIARA UM NUMERO MAIOR 
	 * DE CONTAS.
	 * @param ref
	 */
	public void adicionarConta(Conta ref) {
		
		if( this.referencias.length <= this.posicao) {
			int newPosition = this.referencias.length*2;
			Conta[] novoArray = new Conta[newPosition];
			
			for(int x = 0; x < this.referencias.length; x ++) {
				novoArray[x] = referencias[x];
			}
			this.referencias = novoArray;
			System.out.println("NOVO TAMANHO ARRAY: " + referencias.length);
		}
		
		this.referencias[this.posicao] = ref;
		System.out.println("Conta add com sucesso na pos: " + posicao);
		this.posicao ++;
	}
	
	public Conta getConta(int pos) {
		Conta conta =  this.referencias[pos];
		System.out.println("CONTA: " + conta );
		return conta;
	}
	public void totalConta() {
		System.out.println("TOTAL DE CONTAS ARMAZENADA: " + this.posicao);
	}
	public void retornaContas() {
		
	}
}
