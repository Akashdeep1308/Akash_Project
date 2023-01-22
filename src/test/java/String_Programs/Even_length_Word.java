package String_Programs;

public class Even_length_Word {

	public static void main(String[] args) {
		
		String str = "akash deep suhane";
		 String [] str1=  str.split(" ");
		 for(String word: str1)
		 {
			int length =  word.length();
			
			if(length%2==0)
			{
				System.out.println(word);
			}
			
			
		 }
		
		

	}

}
