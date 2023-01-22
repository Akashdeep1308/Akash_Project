package Core_Java;

public class Emp implements Comparable <Emp> {

	private int empid;
	
	private int salary;
	
	private String Name;
	
	
	public int compareTo(Emp o) {
		
		return this.empid-o.empid;
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

	public Emp(int empid, int salary, String name) {
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
