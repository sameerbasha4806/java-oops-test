package elcBlc;

public class Employeee {
	private int empId;
	private String empName;
	private int empSalary;
	public  int getsempId() {
		return empId;
	}
	public String getempName() {
		return empName;
	}
	public int getempSalary() {
		return empSalary;
	}
	public void setempId(int id) {
		empId=id;
	}
	public void setempName(String name) {
		empName=name;
	}
	public void setSalary(int salary) {
		empSalary=salary;
	}
	public static Employeee getEmployeeDetails(int empId, String empName, int empSalary) {
		Employeee emp = new Employeee();
		emp.setempId(empId);
		emp.setempName(empName);
		emp.setSalary(empSalary);
		return emp;
	}

}
