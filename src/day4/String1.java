package day4;

import java.util.Scanner;

public class String1
{
	    public static void main(String[] args) 
	    {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();    
	        String rev="";
	        char[] ch=A.toCharArray();
	        for(int i=ch.length-1;i>=0;i--)
	        {
	            rev=rev+ch[i];
	        }
	        System.out.println(rev);
	        if(rev.equals(A))
	        {
	            System.out.println("Yes");
	        }
	        else
	        {
	            System.out.println("No");
	        }
	    }
	}
