package oops;

import java.util.Scanner;

class BankAccounts
{
	private double balance;
	
	BankAccounts(double balance)
	{
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	
	public void withdraw(double amount)
	{
		balance=balance-amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void displayBalance()
	{
		System.out.println("Balance: "+getBalance());
	}
}

class SavingsAccounts extends BankAccounts
{
	SavingsAccounts(double balance)
	{
		super(balance);
	}
	
	public void calaculateInterest()
	{
		double interest=(getBalance()*5)/100;
		System.out.println("Interest: "+interest);
	}
}

public class Problem3 
{
   public static void main(String[] args) 
   {
	  Scanner sc=new Scanner(System.in);
	  double balance=sc.nextDouble();
	  double deposit=sc.nextDouble();
	  double withdraw=sc.nextDouble();
	  
	  SavingsAccounts sa=new SavingsAccounts(balance);
	  sa.deposit(deposit);
	  sa.withdraw(withdraw);
	  sa.displayBalance();
	  sa.calaculateInterest();
   }
}
