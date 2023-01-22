package Core_Java;

import java.util.Comparator;

public class Emp1 implements Comparator <Emp1> {

	private int empid;
	
	private int salary;
	
	private String Name;
	
	public int compare(Emp1 o1, Emp1 o2) {
		
		return o1.empid-o2.empid;
	}
	
	
	public int getEmpid() {
		return empid;
	}

	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", salary=" + salary + ", Name=" + Name + "]";
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public Emp1(int empid, int salary, String name) {
		super();
		this.empid = empid;
		this.salary = salary;
		Name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


	

	

	
	
	
	
}
