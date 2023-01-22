package String_Programs;

public class Remove_Special_Characters {

	public static void main(String[] args) {
		
		String str ="asgfhh@#$";
		int count =0;
		String RemoveSPC="";
		
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isDigit(str.charAt(i))&&(!Character.isLetter(str.charAt(i)))&&(!Character.isWhitespace(str.charAt(i))))
			{
				count++;
			}
			else
				
				RemoveSPC= RemoveSPC+str.charAt(i);
					
		}
		
		System.out.println("RemoveSPC " +RemoveSPC);
		System.out.println(count);

	}

}
