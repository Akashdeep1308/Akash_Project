package String_Programs;

public class Second_Largest_String {

	public static void main(String[] args) {
		
     
		String str = "Akash deep Suhane";
		String [] array = str.split(" ");
		int i,j=0;
		String temp=" ";
		
		for(i=0;i<array.length-1;i++)
		{
			for(j=i+1;j<array.length;j++)
			{
				if(array[j].length()>array[i].length())
				{
					
					temp= array[i];
					array[i] = array[j];
					array[j]= temp;
					
				}
			}
		}
		
		for(j=0;j<array.length;j++)
		{
		   System.out.println(array[j]);
		
		}
		
		System.out.println(array[1]);
		
		
	}

}
