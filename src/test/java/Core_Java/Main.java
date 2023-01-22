package Core_Java;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
      
	    ArrayList<Emp1> emp1 = new ArrayList<Emp1>();
	  
	    emp1.add(new Emp1(10,20,"Akash"));
	    emp1.add(new Emp1(14,300,"Vikas"));
	    emp1.add(new Emp1(12,400,"Mohit"));
	    
	  
	    
		System.out.println(emp1);
	    Collections.sort(emp1,new SalaryComprator());
	    System.out.println(emp1);
	    
	  
	
	}

}
