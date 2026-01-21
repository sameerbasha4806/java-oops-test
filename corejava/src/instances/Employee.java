package instances;

public class Employee {
	String empname;
	String empdesg;
	int empsal;
	String empid;
	public String getname() {
		return empname;
		
	}
	public void setname(String employeename) {
		empname=employeename;
		
	}
	public String getdesg() {
		return empdesg;
	}
	public void setdesg(String empdesignation) {
		empdesg=empdesignation;
		
	}
	public int getsal() {
		return empsal;
	}
	public void setsal(int empsalary) {
		empsal=empsalary;
	}

	public static void main(String[] args) {
		Employee obj =new Employee();
		obj.setname("sameer");
		System.out.println("Employee Name: "+obj.getname());
		
		obj.setdesg("software developer");
		System.out.println("Employee Designation: "+obj.getdesg());
		
		obj.setsal(59999);
		System.out.println("Employee Salary: "+obj.getsal());

	}

}
