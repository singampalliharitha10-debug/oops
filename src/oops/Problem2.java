package oops;

import java.util.Scanner;

class Vehicle
{
	private String brand;
	private int speed;
	
	Vehicle(String brand,int speed)
	{
		this.brand=brand;
		this.speed=speed;
	}
//	public void setBrand(String brand)
//	{
//		this.brand=brand;
//	}
	public String getBrand()
	{
		return brand;
	}
	
//	public void setSpeed(int speed)
//	{
//		this.speed=speed;
//	}
	public int getSpeed()
	{
		return speed;
	}
	
	public void start()
	{
		System.out.println("Vehicle is starting");
	}
	
	public void displayDetails()
	{
		System.out.println("Brand: "+getBrand());
		System.out.println("Speed: "+getSpeed());
	}
}
class Car extends Vehicle
{
	private int doors;
	
	Car(String brand,int speed,int doors)
	{
		super(brand,speed);
		this.doors=doors;
	}
//	public void setDoors(int doors)
//	{
//		this.doors=doors;
//	}
	public int getDoors()
	{
		return doors;
	}
	
	public void displayCar()
	{
		System.out.println("Doors: "+getDoors());
	}
}
public class Problem2 
{
   public static void main(String[] args) 
   {
	  Scanner sc=new Scanner(System.in);
	  String brand=sc.nextLine();
	  int speed=sc.nextInt();
	  int doors=sc.nextInt();
	  Car c=new Car(brand,speed,doors);
//	  c.setBrand(brand);
//	  c.setSpeed(speed);
//	  c.setDoors(doors);  
	  c.start();
	  c.displayDetails();
	  c.displayCar();
   }
}
