package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());

		Account sacc1 = new SavingsAccount(1001, "Maria ", 1000.0, 0.1);
		sacc1.withdraw(200.0);
		System.out.println(sacc1.getBalance());
		
		Account bacc1 = new BusinessAccount(1001, "João", 1000.0, 300.0);
		bacc1.withdraw(200.0);
		System.out.println(bacc1.getBalance());

	}

}
