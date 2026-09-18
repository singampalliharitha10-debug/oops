package day3;

import java.util.HashMap;

public class Arrinhash 
{
   public static void main(String[] args) 
   {
	 int[] arr= {2,3,3,2,8,8,9,9,5,5,7,7,3,1};
	 HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
	 
	 for(int num:arr)
	 {
		 if(h.containsKey(num))
		 {
			h.put(num, h.get(num)+1);
		 }
		 else
		 {
			 h.put(num, 1);
		 }
	 }
	 for(int num:arr)
	 {
		 if(h.get(num)==1)
		 {
			 System.out.println(num);
			 break;
		 }
	 }
   }
}
