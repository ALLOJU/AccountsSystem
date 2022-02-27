package com.bridgelabz;

public class Account {

	private double balance;

	//created parametrized constructer
	public Account(double initialbalance) {
		if(initialbalance > 0.0)
			balance=initialbalance;
	}
	//method to credit amount to account
	public void credit(double amount)
	{
		balance =balance + amount;
	}
	//method to debit amount to account
	public void debit(double amount)
	{
		balance =balance - amount;
	}
	public double getBalance() {
		return balance;
	}


}

