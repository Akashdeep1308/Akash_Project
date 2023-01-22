package String_Programs;

public class Rotation_Of_String {

	public static void main(String[] args) {
		
		String str1 = "abcd";
		String str2 = "bcada";
		
		String temp = str1+str1;
		System.out.println(temp);
		
		if(str1.length()!=str2.length())
		{
			System.out.println("String is not in Rotation");
		}
		
		else if(temp.contains(str2))
		{
			System.out.println("Strings are in Rotation");
		}
		else
			System.out.println("Strigs are not in Rotation");
		
		

	}

}
