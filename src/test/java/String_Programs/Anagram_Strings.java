package String_Programs;

import java.util.Arrays;

public class Anagram_Strings {

	public static void main(String[] args) {
		
		String str1 ="Listen";
		String str2 ="Silent";
		    
		     str1=  str1.toLowerCase();
		     str2=  str2.toLowerCase();
		     System.out.println(str1);
		     System.out.println(str2);
		
		if(str1.length()!=str2.length())
		  System.out.println("Not Anagram");
		else
		{
		
	     char [] ch = str1.toCharArray();
	     char [] ch1 = str2.toCharArray();

	    Arrays.sort(ch);
	    Arrays.sort(ch1);
	    System.out.println(ch +" " +ch1);
	    boolean value=Arrays.equals(ch, ch1);
	     if(value==true )
	    	System.out.println("Anagram string");
	    else
	    	System.out.println("Not Anagram");
	   
	   
	    
		}
		
	

	}

	@Override
	public String toString() {
		return "Anagram_Strings [toString()=" + super.toString() + "]";
	}

}
