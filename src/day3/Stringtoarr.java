package day3;

import java.util.HashMap;

public class Stringtoarr 
{
   public static void main(String[] args) 
   {
	  String st="swiss";
	  char[] ch=st.toCharArray();
	  HashMap<Character,Integer> h=new HashMap<Character,Integer>();
	  
	  for(char c:ch)
	  {
		  if(h.containsKey(c))
		  {
			  h.put(c, h.get(c)+1);
		  }
		  else
		  {
			  h.put(c, 1);
		  }
	  }
	  for(char c:ch)
	  {
		  if(h.get(c)==1)
		  {
			 System.out.println(c);
			 break;
		  }
	  }
   }
}
