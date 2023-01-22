package String_Programs;

public class Vowel_Count {

	public static void main(String[] args) {
		
		String str= "Akash deep Suhane";
		String str1 =  str.toLowerCase();
		int consonent=0;
		char[] ch = str1.toCharArray();
		int count =0;
		int count1=0;
		 
		
		 for(Character ch1: ch)
		 {
			 if(ch1.equals('a')||ch1.equals('e')||ch1.equals('i')||ch1.equals('o')||ch1.equals('u'))
			 {
				 count++;
				 System.out.println(ch1);
			 }
			 
			 if(ch1.equals(' '))
			 {
				 count1++;
			 }
		 }
		 
		 consonent = str.length()-count-count1;
		 
		 System.out.println("Vowel_Count "+count);
		 System.out.println("Consonent_Count "+consonent);
		

	}

}
