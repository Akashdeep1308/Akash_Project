import java.util.HashMap;
import java.util.Map.Entry;

public class Program {

	public static void main(String[] args) {
		String name = "aksash";
        char[] ch = name.toCharArray();
        int count =0;
        
   
       
       HashMap<Character, Integer> map = new HashMap<Character, Integer>();
       for(char ch1: ch)
       {
    	   if(map.containsKey(ch1))
           {
               map.put(ch1,map.get(ch1)+1);
               
           }
           
           else
           map.put(ch1,1);
       
       }
       
      System.out.println(map);
      
     for(Entry<Character, Integer> mp :map.entrySet())
     {
    	 if(mp.getValue()>1)
    	 {
    		 System.out.println(mp.getKey());
    	 }
     }
     
                 
       
       

	}

}
