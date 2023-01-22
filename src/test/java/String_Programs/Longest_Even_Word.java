package String_Programs;

public class Longest_Even_Word {

	public static void main(String[] args) {
		String str= "My name is Akashdeep Suhane";
		 String [] array = str.split(" ");
		 
		 
		 String max_word= array[0];
		
		for(int i=0;i<array.length;i++)
		{
		 
		 if(array[i].length()%2==0)
		 {
			 if(array[i].length()>max_word.length())
			 {
				 max_word= array[i];
			 }
		
		 }
	
		

	}
		  System.out.println(max_word);	 
	}
}
