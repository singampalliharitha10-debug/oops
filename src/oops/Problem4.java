package oops;

import java.util.Scanner;

abstract class Employee
{
	abstract void calculateSalary();
}

class Developer extends Employee
{
	private double basicSalary;
	
	Developer(double basicSalary)
	{
		this.basicSalary=basicSalary;
	}
	
	public double getSalary()
	{
		return basicSalary;
	}
	
	@Override
	public void calculateSalary()
	{
		basicSalary=basicSalary+((basicSalary*20)/100);
		System.out.println("Developer Salary: "+basicSalary);
	}
}

class Manager extends Employee
{
	private double basicSalary;
	
	Manager(double basicSalary)
	{
		this.basicSalary=basicSalary;
	}
	
	@Override
	public void calculateSalary()
	{
		basicSalary=basicSalary+((basicSalary*30)/100);
		System.out.println("Manager Salary: "+basicSalary);
	}
	
}
public class Problem4 
{
   public static void main(String[] args) 
   { 
	   Scanner sc=new Scanner(System.in);
	   double dbs=sc.nextDouble();
	   double mbs=sc.nextDouble();
	   Employee e1=new Developer(dbs);
	   Employee e2=new Manager(mbs);
	   e1.calculateSalary();
	   e2.calculateSalary();
   }
}
