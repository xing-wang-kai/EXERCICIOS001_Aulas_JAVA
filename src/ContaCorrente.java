
public class ContaCorrente extends Conta {
	public ContaCorrente(double saldo, int agencia, int numero, Cliente titular ) {
		super(saldo, agencia, numero, titular);
	}
	
	/**
	 * REESCREVE UM METODO QUE EXISTE NA CLASS PAI,
	 *  NESTE CASO O RETORNO È ACRESCIMO DE 0.90 
	 *  DESCONTADO NO SALDO DA CLASS FILHA
	 */
	@Override
	public boolean sacar(double valor) {
		// TODO Auto-generated method stub
		double valorSacar = valor + 0.90;
		return super.sacar(valorSacar);
	}
}
