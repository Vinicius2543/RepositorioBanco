
public class ClassePrincipal {

	public static void main(String[] args) {
		ClasseConta objeto_conta_um; // cria uma variavel
		objeto_conta_um = new ClasseConta(); // instancia o objeto
		
		ClasseConta objeto_conta_dois = new ClasseConta(); // cria a variavel e instancia o objeto(inline)
		
		objeto_conta_um.atributoNumeroConta = 123;
		objeto_conta_um.atributoSaldoConta = 2_600.00F;
		objeto_conta_um.atributoTipoConta = "Conta Poupança";
		
		objeto_conta_dois.atributoNumeroConta = 789;
		objeto_conta_dois.atributoSaldoConta = 4_000.00F;
		objeto_conta_dois.atributoTipoConta = "Conta Corrente";
		
		System.out.println("conta 1 numero da conta: " + objeto_conta_um.atributoNumeroConta);
		System.out.println("conta 1 saldo da conta: " + objeto_conta_um.atributoSaldoConta);
		System.out.println("conta 1 tipo de conta: " + objeto_conta_um.atributoTipoConta);
		
		
		System.out.println("conta 1 numero da conta: " + objeto_conta_dois.atributoNumeroConta);
		System.out.println("conta 1 saldo da conta: " + objeto_conta_dois.atributoSaldoConta);
		System.out.println("conta 1 tipo de conta: " + objeto_conta_dois.atributoTipoConta);
		
		objeto_conta_um.atributoPessoa = new ClassePessoa();
		
		objeto_conta_um.atributoPessoa.atributoNomePessoa = "Fulano";
		objeto_conta_um.atributoPessoa.atributoDocumentoPessoa = 333;
			
		
		objeto_conta_dois.atributoPessoa = new ClassePessoa();
		
		objeto_conta_dois.atributoPessoa.atributoNomePessoa = "Fulano";
		objeto_conta_um.atributoPessoa.atributoDocumentoPessoa = 333;
		
		objeto_conta_um.metodoDepositar(500.00F);
		
		System.out.println("conta 1 saldo da conta: " + objeto_conta_um.atributoSaldoConta);
		
		objeto_conta_um.metodoSacar(400.00F);
		
		System.out.println("conta 1 saldo da conta: " + objeto_conta_um.atributoSaldoConta);
		
		objeto_conta_um.metodoTransferir(500, objeto_conta_um, objeto_conta_dois);
		
		System.out.println("conta 1 saldo da conta: " + objeto_conta_um.atributoSaldoConta);
		System.out.println("conta 2 saldo da conta: " + objeto_conta_dois.atributoSaldoConta);
	}

}
