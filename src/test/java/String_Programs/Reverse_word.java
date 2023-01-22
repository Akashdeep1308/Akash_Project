package String_Programs;

import java.util.Stack;

public class Reverse_word {

	public static void main(String[] args) {
	  
		
		String str = "Akash deep Suhane babu";
		String [] str1  = str.split(" ");
		String str3 = "";
		
		for(String str2: str1)
		{
			
			for(int i=str2.length()-1;i>=0;i--)
			{
				
				str3 = str3+ str2.charAt(i);
				
			}
			
			str3+=" ";
			
			
		}
		System.out.println(str3);
		
		
		
		   
		
//    2-  By using Stack
	
		
//		    Stack<Character> st= new Stack<Character>();
//		
//		
//			for(int i=0;i<str.length();i++)
//			{
//			Character ch= str.charAt(i);
//			if(ch!=' ')
//			st.push(ch);
//			else {
//			while(st.empty()==false)
//			   System.out.print(st.pop());
//			}
//			if(st.empty()==true)
//			System.out.print(" ");
//			}
//			while(st.empty()==false)
//				   System.out.print(st.pop());
				
			
	}
			
		}
		
		

	


