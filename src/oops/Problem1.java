package oops;

import java.util.Scanner;

class Student 
{
   private String name;
   private int age;
   private double marks;
   
   Student(String name,int age,double marks)
   {
	   this.name=name;
	   this.age=age;
	   this.marks=marks;
   }
   
   public void setName(String name)
   {
	   this.name=name;
   }
   public String getName()
   {
	   return name;
   }
   
   public void setAge(int age)
   {
	   this.age=age;
   }
   public int getAge()
   {
	   return age;
   }
   
   public void setMarks(double marks)
   {
	   if(marks>0.0 && marks<100.0)
	   this.marks=marks;
	   else
	   System.out.println("enter valid marks");
   }
   public double getMarks()
   {
	   return marks;
   }
   
   public void displayDetails()
   {
	   System.out.println("Name = "+getName());
	   System.out.println("Age = "+getAge());
	   System.out.println("Marks = "+getMarks());
   }
}

public class Problem1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		double marks=sc.nextDouble();
		Student student=new Student(name,age,marks);
		student.displayDetails();
	}
}