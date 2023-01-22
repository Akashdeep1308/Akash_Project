package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	@Test(dataProvider="getData")
	public void Data_Matrix(String Name, String No, String adress, String coloumn)
	{
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
	
		Object [] [] data = new Object[2][4];
		
		data [0] [0] = "Akash";
		data [0] [1] = "123";
		data [0] [2] = "Suhane";
		data [0] [3] =  "deep";
		
		data [1] [0] = "Vikas";
		data [1] [1] = "1234";
		data [1] [2] = "deep";
		data [1] [3] = "ravi";
		
		
		return data;
		
	}
	


}
