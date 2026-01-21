package elcBlc;

public class Employee {
	String employeeName;
	double salary;
	public void increaseSalary(Employee e) {
		e.salary=e.salary + (e.salary*0.10);
		System.out.println("Updated salary of "+e.employeeName+" is: "+e.salary);
	}

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.employeeName="sameer";
		obj.salary=50000.0;
		obj.increaseSalary(obj);
	}

}
