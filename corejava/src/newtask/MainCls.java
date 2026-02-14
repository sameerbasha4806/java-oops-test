package newtask;
import java.util.Scanner;
 
 public class MainCls {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Employee Name:");
	        String name = sc.nextLine();

	        System.out.println("Enter Employee ID:");
	        int id = sc.nextInt();
	        sc.nextLine();
	        System.out.println("Enter Department:");
	        String dept = sc.nextLine();
	        System.out.println("Enter Project Name:");
	        String project = sc.nextLine();
	        System.out.println("Enter Project Role:");
	        String role = sc.nextLine();
	        System.out.println("Enter 3 Monthly Performance Scores:");
	        System.out.print("Month 1: ");
	        double month1 = sc.nextInt();
	        System.out.print("Month 2: ");
	        double month2 = sc.nextInt();
	        System.out.print("Month 3: ");
	        double month3 = sc.nextInt();
	        ProjectEmployee pe =
	                new ProjectEmployee(name, id, dept, project, role, month1, month2, month3);
	        while (true) {
	            System.out.println("Menu");
	            System.out.println("1. Update Project Role");
	            System.out.println("2. Update Project Name");
	            System.out.println("3. View Employee Profile");
	            System.out.println("4. View Average Performance");
	            System.out.println("5. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine();
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter New Project Role: ");
	                    pe.updateProjectRole(sc.nextLine());
	                    break;
	                case 2:
	                    System.out.print("Enter New Project Name: ");
	                    pe.updateProjectName(sc.nextLine());
	                    break;
	                case 3:
	                    pe.viewProfile();
	                    break;
	                case 4:
	                    pe.viewAveragePerformance();
	                    break;
	                case 5:
	                    System.out.println("Exiting Program...");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid Choice!");
	            }
	            
	        }
	        
	    }
	  
	}
