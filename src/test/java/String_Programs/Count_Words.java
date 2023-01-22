package String_Programs;

public class Count_Words {

	public static void main(String[] args) {
		
		String str = "Akash Mohan";
		int count =1;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
				count++;
		}
		
		System.out.println("No of words "+ count);

	}

}
