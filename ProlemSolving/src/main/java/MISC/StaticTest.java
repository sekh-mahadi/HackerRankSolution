package MISC;

class Employee {
	static String companyName = "MTech";
	String name;
	int eid;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + ", Company Name: "+companyName+"]";
	}
	
	

}

public class StaticTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Mahadi", 1001);
		Employee e2 = new Employee("Rupon", 1002);
		
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
