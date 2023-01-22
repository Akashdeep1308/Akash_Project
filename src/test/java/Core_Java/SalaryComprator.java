package Core_Java;

import java.util.Comparator;

public class SalaryComprator implements Comparator<Emp1> {

	

	public int compare(Emp1 o1, Emp1 o2) {
		
		return o1.getSalary()-o2.getSalary();
	}

}
