package day2;

import java.util.Scanner;

public class Encryption_dec 
{
   Scanner sc=new Scanner(System.in);
   String encryptedMessage=sc.nextLine();
   Result rs=new Result();
}
class Result 
{
    public String decryptMessage(String encryptedMessage) 
    {
       String rev="";
       String[] s=encryptedMessage.split("");
       for(int i=0;i<=s.length-1;i++)
       {
          rev=s[i]+rev;
       }
       return rev;
    }

}
