package oops;

import java.util.Scanner;

abstract class BankAccountss
{
	private long accountnumber;
	private double balance;
	
	BankAccountss(long accountnumber,double balance)
	{
		this.accountnumber=accountnumber;
		this.balance=balance;
	}	
	
	public long getAccountnumber()
	{
		return accountnumber;
	}
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	
	public void withdrawl(double amount)
	{
		if(balance>=amount)
		balance=balance-amount;
		else
		System.out.println("check your balance and withdraw the money");
	}
	
	abstract void displayDetails();
}

class SavingAccountss extends BankAccountss
{
	private double interestrate;
	
	SavingAccountss(long accountnumber,double balance,int interestrate)
	{
		super(accountnumber,balance);
		this.interestrate=interestrate;
	}

	public double getInterestrate()
	{
		return interestrate;
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Account Number: "+getAccountnumber());
        System.out.println("Balance: "+getBalance());
        System.out.println("Interest Rate: "+getInterestrate());
	}
}

class CurrentAccountss extends BankAccountss
{
	private double overdraftlimit;
	CurrentAccountss(long accountnumber,double balance,double overdraftlimit)
	{
		super(accountnumber,balance);
		this.overdraftlimit=overdraftlimit;
	}
	
	public double getOdl()
	{
		return overdraftlimit;
	}

	public void withdrawl(double amount)
	{
		if((getBalance()-amount)+overdraftlimit>=0)
		{
			double newbala=getBalance()-amount;
			setBalance(newbala);
		}
		else
		{
			System.out.println("withdrawl not allowed");
		}
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Account Number: "+getAccountnumber());
		System.out.println("Balance: "+getBalance());
		System.out.println("Overdraft Limit: "+getOdl());
	}
}

public class Problem10 
{
   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
	   long ac=sc.nextLong();
	   double bal=sc.nextDouble();
	   int ir=sc.nextInt();
	   double with=sc.nextDouble();
	   
	   SavingAccountss sas=new SavingAccountss(ac, bal,ir);
	   sas.withdrawl(with);
	   sas.displayDetails();
	   
	   long ac1=sc.nextLong();
	   double bals=sc.nextDouble();
	   double odl=sc.nextDouble();
	   double withdraw=sc.nextDouble();
	   CurrentAccountss cas=new CurrentAccountss(ac1,bals,odl);
	   cas.withdrawl(withdraw);
	   cas.displayDetails();
   }
}
