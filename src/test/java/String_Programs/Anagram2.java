package String_Programs;

public class Anagram2 {

	public static void main(String[] args) {
		
		String str1 = "Akash";
		String str2 = "sakah";
		str1= str1.toLowerCase();
		str2= str2.toLowerCase(); 
		
		if(str1.length()!=str2.length())
			System.out.println("Not anagram");
		
		
		else
		{
			char [] ch =    str1.toCharArray();
		
			StringBuilder sb = new StringBuilder(str2);
			
			for(char ch1: ch)
			{
				int index=  sb.indexOf(""+ch1);
				if(sb.indexOf(""+ch1)!=-1) {
					 sb.deleteCharAt(index);
					 if(sb.length()==0)
						 System.out.println("Anagram");
				}
				else
				{
					System.out.println("Not Anagram");
					break;
				
			}
		}
		        
		
		}
	}
}
	


