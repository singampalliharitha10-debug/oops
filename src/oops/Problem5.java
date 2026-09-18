package oops;

import java.util.Scanner;

interface Payment
{
	void pay(double amount);
}

class UPIPayment implements Payment
{
	@Override
	public void pay(double amount)
	{
		System.out.println("UPI Payment: "+amount);
	}
}

class CreditCardPayment implements Payment
{
	@Override
	public void pay(double amount)
	{
		System.out.println("CreditCardPayment: "+amount);
	}
}

class CashPayment implements Payment
{
	@Override
	public void pay(double amount)
	{
		System.out.println("CashPayment: "+amount);
	}
}

public class Problem5 
{
   public static void main(String[] args) 
   {
	  Scanner sc=new Scanner(System.in);
	  double up=sc.nextDouble();
	  double ccp=sc.nextDouble();
	  double cp=sc.nextDouble();
	  
	  Payment p1=new UPIPayment();
	  Payment p2=new CreditCardPayment();
	  Payment p3=new CashPayment();
	  p1.pay(up);
	  p2.pay(ccp);
	  p3.pay(cp);
   }
}
