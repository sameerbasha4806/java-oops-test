package newtask;

	public class ProjectEmployee extends Employee {
		    private String projectName;
		    private String projectRole;
		    private double month1;
		    private double month2;
		    private double month3;
		    public ProjectEmployee(String employeeName, int employeeId, String department,
		                           String projectName, String projectRole,
		                           double month1, double month2, double month3) {

		        super(employeeName, employeeId, department);
		        if (projectName != null && !projectName.isEmpty()) {
		            this.projectName = projectName;
		        }
		        if (projectRole != null && !projectRole.isEmpty()) {
		            this.projectRole = projectRole;
		        }
		        if (month1 >= 0 && month1 <= 100) {
		            this.month1 = month1;
		        } else {
		            this.month1 = 0;
		        }
		        if (month2 >= 0 && month2 <= 100) {
		            this.month2 = month2;
		        } else {
		            this.month2 = 0;
		        }
		        if (month3 >= 0 && month3 <= 100) {
		            this.month3 = month3;
		        } else {
		            this.month3 = 0;
		        }
		        System.out.println("Employee Profile Created");
		    }
		    public void updateProjectRole(String role) {
		        if (role != null && !role.trim().isEmpty()) {
		            projectRole = role;
		            System.out.println("Project Role Updated Successfully");
		        } else {
		            System.out.println("Invalid Project Role");
		        }
		    }
		    public void updateProjectName(String name) {
		        if (name != null && !name.trim().isEmpty()) {
		            projectName = name;
		            System.out.println("Project Name Updated Successfully");
		        } else {
		            System.out.println("Invalid Project Name");
		        }
		    }
		    public void viewProfile() {
		        System.out.println("Employee Details");
		        super.displayEmployeeDetails();
		        System.out.println("Project Name: " + projectName);
		        System.out.println("Project Role: " + projectRole);
		        System.out.println("Performance Scores: "+ month1 + " " + month2 + " " + month3);
		    }
		    public void viewAveragePerformance() {
		        double average = (month1 + month2 + month3) / 3.0;
		        System.out.println("Average Performance Score: " + average);
		    }
	  

}
