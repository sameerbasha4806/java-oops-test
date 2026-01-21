package elcBlc;

public class Company {

	public static void main(String[] args) {
		Employeee emp = Employeee.getEmployeeDetails(10,"sameer",60000);
		System.out.println("employee ID: "+emp.getsempId());
		System.out.println("employee name: "+emp.getempName());
		System.out.println("employee salary: "+emp.getempSalary());
	}

}
