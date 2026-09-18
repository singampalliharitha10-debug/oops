package day1;

public class Sumofnnatural 
{
   public static void main(String[] args)
   {
	   int n=4;
	   int sum=0;
	   for(int i=1;i<=n;i++)
	   {
		   for(int j=1;j<=i;j++)
		   {
			   sum++;
		   }
	   }
//	   for(int i=1;i<=n;i++)
//	   {
//		   sum=sum+i;
//	   }
//	   sum=n*(n+1)/2;
	   System.out.println(sum);
   }
}
