package oops;

//abstract class BankAccount
//{
//	private double balance;
//	
//	BankAccount(double balance)
//	{
//		this.balance=balance;
//	}
//	
//	public void deposit(double amount)
//	{
//		balance=balance+amount;
//	}
//	
//	public double getBalance()
//	{
//		return balance;
//	}
//	
//	abstract void calculateInterest();
//}
//
//class SavingsAccount extends BankAccount
//{
//	SavingsAccount(double balance)
//	{
//		super(balance);
//	}
//	
//	public void calculateInterest()
//	{
//		System.out.println("Savings Interest is 5%");
//	}
//}
//
//class CurrentAccount extends BankAccount
//{
//	CurrentAccount(double balance)
//	{
//		super(balance);
//	}
//	
//	public void calculateInterest()
//	{
//		System.out.println("Current Interest is 2%");
//	}
//}
interface BankAccount
{
	void calculateInterest();
}

class SavingsAccount implements BankAccount
{
	private double balance;

	SavingsAccount(double balance)
	{
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	@Override
	public void calculateInterest()
	{
		System.out.println("Savings Account interest is 5%");
	}
}

class CurrentAccount extends SavingsAccount
{
	CurrentAccount(double balance)
	{
		super(balance);
	}
	
	@Override
	public void calculateInterest()
	{
		System.out.println("Current Account interest is 2%");
	}
}

public class Singleexampleoops
{
	public static void main(String[] args) 
	{
		SavingsAccount sa=new SavingsAccount(1000);
		sa.deposit(200);
		System.out.println("balance is: "+sa.getBalance());
		sa.calculateInterest();
		
		SavingsAccount ba=new CurrentAccount(2000);
		ba.deposit(100);
		System.out.println("balance is: "+ba.getBalance());
		ba.calculateInterest();
	}
}