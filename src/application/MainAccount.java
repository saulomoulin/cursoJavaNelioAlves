package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class MainAccount {

	public static void main(String[] args) {
		
//		Account acc1 = new Account(1001, "Saulo", 950.0);
//		acc1.withdraw(250.0);
//		System.out.println("Saldo Conta Normal..: " + acc1.getBalance()+ " - Desconta R$5 no saque");
		
		Account acc2 = new SavingsAccount(1002, "Saulo", 950.0, 0.01);
		acc2.withdraw(250.0);
		System.out.println("Saldo Conta Poupança: " + acc2.getBalance()+ " - Não existe desconto no saque");
		
		Account acc3 = new BusinessAccount(1003, "Saulo", 950.0, 500.0);
		acc3.withdraw(250.0);
		System.out.println("Saldo Conta Empresa.: " + acc3.getBalance() + " - Desconta R$7 no saque");
		System.out.println();;
		
		
		// EXEMPLO POLIMORFISMO
		// eu chamei a mesma operação em variáveis do mesmo tipo, mas elas tiveram
		// comportamento distinto conforme o objeto para os quais elas apontam
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println("// Polimorfismo");
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
	}

}
