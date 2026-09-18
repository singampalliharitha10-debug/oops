package oops;

import java.util.Scanner;

class Employees
{
	private String name;
	private double salary;
	
	Employees(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	
	public void displayDetails()
	{
		System.out.println("Name: "+getName());
		System.out.println("Salary: "+getSalary());
	}
}

class Developers extends Employees
{
	private String pl;
	
	Developers(String name,double salary,String pl)
	{
		super(name,salary);
		this.pl=pl;
	}
	
	public String getPl()
	{
		return pl;
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Programming Language: "+getPl());
	}
	
}

class Tester extends Employees
{
	private String ttool;
	
	Tester(String name,double salary,String ttool)
	{
		super(name, salary);
		this.ttool=ttool;
	}
	
	public String getTtool()
	{
		return ttool;
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Testing Tool: "+getTtool());
	}
}
public class Problem9 
{
   public static void main(String[] args) 
   {
	   Scanner sc=new Scanner(System.in);
	   String name=sc.nextLine();
	   double salary=sc.nextDouble();
	   sc.nextLine();
	   String pl=sc.nextLine();
	   
	   Developers d=new Developers(name, salary, pl);
	   d.displayDetails();
	   
	   String names=sc.nextLine();
	   double salarys=sc.nextDouble();
	   sc.nextLine();
	   String tl=sc.nextLine();
	   Tester t=new Tester(names,salarys,tl);
	   t.displayDetails();
   }
}
