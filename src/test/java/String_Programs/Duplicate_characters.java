package String_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Duplicate_characters {

	public static void main(String[] args) {
		  String str = "Akashdeep Suhane";
		  String str1 =str.replace(" ", "");
		   String str2 = str1.toLowerCase();
		  char[] ch = str2.toCharArray();
		  
		  HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		  for(char ch1:ch)
		  {
			  if(map.containsKey(ch1))
				  map.put(ch1, map.get(ch1)+1);
			  
			  else
				  map.put(ch1, 1);
		  }
		    System.out.println(map);
		    for(Entry<Character, Integer>  mp:map.entrySet())
		      
		      if(mp.getValue()>1)
		       System.out.println(mp.getKey()+" "+mp.getValue());
		  
		        
		
		

	}

}
