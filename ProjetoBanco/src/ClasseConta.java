
public class ClasseConta {
		short atributoNumeroConta;
		float atributoSaldoConta;
		String atributoTipoConta;
		
		ClassePessoa atributoPessoa;
		
		void metodoDepositar(float parametroValorEnviado){
			this.atributoSaldoConta += parametroValorEnviado;
		}
		
		void metodoSacar(float parametroValorSaque){
			
			if (this.atributoSaldoConta >= parametroValorSaque){
				this.atributoSaldoConta -= parametroValorSaque;
			}
			else{
				System.out.println("Não é possivel sacar mais do que voce tem de saldo");
			}
		}
		
		void metodoTransferir(float parametroValorTransferido,ClasseConta origem,ClasseConta destino){
			origem.atributoSaldoConta -= parametroValorTransferido;
			destino.atributoSaldoConta += parametroValorTransferido;
		}
}
