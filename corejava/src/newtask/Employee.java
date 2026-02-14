package newtask;

public class Employee {
	    private String employeeName;
	    private int employeeId;
	    private String department;
	    public Employee(String employeeName, int employeeId, String department) {

	        if (employeeName != null && !employeeName.trim().isEmpty()) {
	            this.employeeName = employeeName;
	        } else {
	            System.out.println("Invalid Employee Name");
	        }
	        if (employeeId > 0) {
	            this.employeeId = employeeId;
	        } else {
	            System.out.println("Invalid Employee ID");
	        }

	        if (department != null && !department.trim().isEmpty()) {
	            this.department = department;
	        } else {
	            System.out.println("Invalid Department");
	        }
	    }
	    public void displayEmployeeDetails() {
	        System.out.println("Name: " + employeeName);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Department: " + department);
	    }
	
}
