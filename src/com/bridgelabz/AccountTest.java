package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		//declaring variables
		double depositAmount;
		double debitAmount;
		//created  object 
		Account ac1=new Account(50.00);
		Account ac2=new Account(-7.0);
		System.out.printf("Account1 Balance: $%.2f\n", ac1.getBalance());
		System.out.printf("Account2 Balance: $%.2f\n\n", ac2.getBalance());
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Enter deposit amount for account1: " ); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf( "\nadding %.2f to account1 balance\n\n", depositAmount );
		ac1.credit( depositAmount ); // add to account1 balance
		// display balances
		System.out.printf( "Account1 balance: $%.2f\n", ac1.getBalance() );
		System.out.printf( "Account2 balance: $%.2f\n\n", ac2.getBalance() );

		System.out.print( "Enter deposit amount for account2: " ); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf( "\nAdding %.2f to account2 balance\n\n", depositAmount );
		ac2.credit( depositAmount ); // add to account2 balance

		// display balances
		System.out.printf( "Account1 balance: $%.2f\n", ac1.getBalance() );
		System.out.printf( "Account2 balance: $%.2f\n", ac2.getBalance() );

		System.out.print( "Enter debit amount for account1: " );
		debitAmount = input.nextDouble();
		System.out.printf( "\nSubtracting %.2f from account1 balance\n\n", debitAmount );
		if (ac1.getBalance()>=debitAmount) {
			ac1.debit( debitAmount );
			System.out.printf( "Account1 balance: $%.2f\n", ac1.getBalance() );
			System.out.printf( "Account2 balance: $%.2f\n\n", ac2.getBalance() );
		}
		else {
			System.out.printf("!!! Debit amount exceeded account balance!!!\n\n");
		}

		// display balances
		System.out.print( "Enter debit amount for account2: " );
		debitAmount = input.nextDouble();
		System.out.printf( "\nSubtracting %.2f from account2 balance\n\n", debitAmount );
		if (ac1.getBalance()>=debitAmount) {
			ac1.debit( debitAmount );
			System.out.printf( "Account1 balance: $%.2f\n", ac1.getBalance() );
			System.out.printf( "Account2 balance: $%.2f\n\n", ac2.getBalance() );
		}
		else {
			System.out.printf("!!!Debit amount exceeded account balance!!!\n\n");
		}

	}
}
