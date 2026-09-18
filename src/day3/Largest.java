package day3;

public class Largest 
{
  public static void main(String[] args) 
  {
	 int arr[]= {4,2,7,2,9,4,5};
	 int max=Integer.MIN_VALUE;
	 for(int i=0;i<=arr.length-1;i++)
	 {
		if(arr[i]>max)
		{
		   max=arr[i];
		}
	 }
	 System.out.println(max);
  }
}
