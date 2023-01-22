package String_Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class Substring_Count {
	
	public static void main(String[] args) {
		 String str = "abcdef";
		 String [] array ={"a","abc","jkm","xyz","def","bcd","lmno"};
		  
		  char [] ch  = str.toCharArray();
		  
		       int count=0;
		        for(int i=0; i<str.length(); i++)
				
				{
		        	for(int j=i+1; j<=str.length(); j++)
		  				
						{
		        	 
		        	  String str1=  str.substring(i, j);
		        	  System.out.println(str1);
		        	  
		        	  
		        	   ArrayList<String> arr = new  ArrayList<String>(Arrays.asList(array));
		        	   if(arr.contains(str1))
		        		   count++;
			        	
		         
		    	}

	}
		        
       System.out.println(count);
	}

}