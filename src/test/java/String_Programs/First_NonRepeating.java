package String_Programs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class First_NonRepeating {

	public static void main(String[] args) {
		
		   String str = "Mhmn Bhagvat";
		   String str1= str.toLowerCase();
		    String str2 = str1.replace(" ", "");
		     System.out.println(str2);
		     char [] ch = str2.toCharArray();
//		      
//		      for(char ch1: ch)
//		      {
//		    	  
//		       if(str2.indexOf(ch1)==str2.lastIndexOf(ch1))
//		       {
//		        	System.out.println(ch1);
//		              break;
//		      }
//		      }
		   
	//2- 
		     LinkedHashMap<Character,Integer> ls = new LinkedHashMap<Character,Integer>();
		      for(Character ch1: ch)
		      {
		    	    
				     if(ls.containsKey(ch1))
				     {
				    	 ls.put(ch1, ls.get(ch1)+1);
				     }
				     else
				    	 ls.put(ch1, 1); 
		      }
		      
		      
		       for(Entry<Character,Integer> map:ls.entrySet())
		       {
		    	  if(map.getValue()==1)
		    	  {
		    		  System.out.println(map.getKey());
		    		   break;
		    	  }
		       }
		 
		     
		   

	}

}
