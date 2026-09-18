package oops;

import java.util.Scanner;

abstract class Product
{
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	
	Product(int productId,String productName,double price,int quantity)
	{
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	
	public int getProductId()
	{
		return productId;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	abstract double calculateTotal();
	abstract double applyDiscount();
	abstract void displayDetails();
}

class Electronics extends Product
{
	private int warrantyYears;
	
	Electronics(int productId,String productName,double price,int quantity,int warrantyYears)
	{
		super(productId,productName,price,quantity);
		this.warrantyYears=warrantyYears;
	}
	
	public int getWarranty()
	{
		return warrantyYears;
	}
	
	@Override
	public double calculateTotal()
	{
		double total=0;
		total=getPrice()*getQuantity();	
		return total;
	}
	
	@Override
	public double applyDiscount()
	{
		double newprice=calculateTotal();
		if(calculateTotal()>=50000)
		{
			newprice=calculateTotal()-(calculateTotal()*10)/100;
		}
		return newprice;
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Product ID: "+getProductId());
		System.out.println("Product Name: "+getProductName());
		System.out.println("Price: "+getPrice());
		System.out.println("Quantity: "+getQuantity());
		System.out.println("Warranty Years: "+warrantyYears);
		System.out.println("Total: "+applyDiscount());
	}
}

class Clothing extends Product
{
	private char size;
	private String brand;
	
	Clothing(int productId,String productName,double price,int quantity,char size,String brand)
	{
		super(productId,productName,price,quantity);
		this.size=size;
		this.brand=brand;
	}
	
	public char getSize()
	{
		return size;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	@Override
	public double calculateTotal()
	{
		double total=0;
		total=getPrice()*getQuantity();	
		return total;
	}
	
	@Override
	public double applyDiscount()
	{
		double newprice=calculateTotal();
		if(getQuantity()>=3)
		{
			newprice=calculateTotal()-((calculateTotal()*15)/100);
		}
		return newprice;
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Product ID: "+getProductId());
		System.out.println("Product Name: "+getProductName());
		System.out.println("Price: "+getPrice());
		System.out.println("Quantity: "+getQuantity());
		System.out.println("Size: "+size);
		System.out.println("Brand: "+brand);
		System.out.println("Total: "+applyDiscount());
	}
}

class Food extends Product
{
	private int expiryDays;
	
	Food(int productId,String productName,double price,int quantity,int expiryDays)
	{
		super(productId,productName,price,quantity);
		this.expiryDays=expiryDays;
	}
	
	public int getExpirydays()
	{
		return expiryDays;
	}
	
	@Override
	public double calculateTotal()
	{
		double total=0;
		total=getPrice()*getQuantity();	
		return total;
	}
	
	@Override
	public double applyDiscount()
	{
		double newprice=calculateTotal();
		if(expiryDays<=2)
		{
			newprice=calculateTotal()-(calculateTotal()*5)/100;
		}
		return newprice;
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Product ID: "+getProductId());
		System.out.println("Product Name: "+getProductName());
		System.out.println("Price: "+getPrice());
		System.out.println("Quantity: "+getQuantity());
		System.out.println("Expiry Days: "+expiryDays);
		System.out.println("Total: "+applyDiscount());
	}
}

public class Problem11 
{
   public static void main(String[] args) 
   {
	  Scanner sc=new Scanner(System.in);
	  
	  int id=sc.nextInt();
	  String name=sc.nextLine();
	  sc.nextLine();
	  double price=sc.nextDouble();
	  int quantity=sc.nextInt();
	  int wy=sc.nextInt();
	  
	  Product p1=new Electronics(id, name, price, quantity, wy);
	  p1.displayDetails();
	  
	  int id2=sc.nextInt();
	  String name2=sc.nextLine();
	  sc.nextLine();
	  double price2=sc.nextDouble();
	  int quantity2=sc.nextInt();
	  char size=sc.next().charAt(0);
	  sc.nextLine();
	  String brand=sc.nextLine();
	  
	  Product p2=new Clothing(id2, name2, price2, quantity2, size, brand);
	  p2.displayDetails();
	  
	  int id3=sc.nextInt();
	  String name3=sc.nextLine();
	  sc.nextLine();
	  double price3=sc.nextDouble();
	  int quantity3=sc.nextInt();
	  int ed=sc.nextInt();
	  
	  Product p3=new Food(id3, name3, price3, quantity3, ed);
	  p3.displayDetails();
	  
	  sc.close();
   }
}
