package day4;

	import java.util.* ;
	import java.io.*; 
	import java.util.Scanner;

	public class Solution 
	{
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        System.out.println(primeDigitSum(a,b));
	    }
	    static int primeDigitSum(int l, int r)
	    {
	        int count=0;
	        int sum=0;
	        for(int i=l+1;i<r;i++)
	        {
	           while(i!=0)
	           {
	               sum=sum+i%10;
	               i=i/10;
	           }
	            if(isPrime(sum))
	            {
	               count++;
	            }
	            return count;
	        }
	        return count;
	    }
	    static boolean isPrime(int n)
	    {
	        int count=0;
	        int f=1;
	        while(f<=n)
	        {
	            if(n%f==0)
	            {
	                count++;
	            }
	            f++;
	        }
	        return count==2;
	    }

	}
