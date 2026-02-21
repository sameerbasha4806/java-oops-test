package inheritance.setB;

import java.util.Scanner;

class Staff{
	String staffName;
	int staffId;
	String baseShift;
	public Staff(String staffName, int staffId, String baseShift) {
		super();
		this.staffName = staffName;
		this.staffId = staffId;
		this.baseShift = baseShift;
	}
	
	
}
class DepartmentStaff extends Staff{
	String departmentName;
	String responsibilityLevel;
	
		
	public DepartmentStaff(String staffName, int staffId, String baseShift, String departmentName,
			String responsibilityLevel) {
		super(staffName, staffId, baseShift);
		this.departmentName = departmentName;
		this.responsibilityLevel = responsibilityLevel;
	}
	
	public void updateResponsibilityLevel(String newresponsibilityLevel) {
		if(newresponsibilityLevel==null && newresponsibilityLevel=="") {
			System.out.println("Appropriate message not updated the stored values: ");
		}else {
			this.responsibilityLevel=newresponsibilityLevel;
			
		}
	}
	public void updateDepartmentName(String newdepartmentName) {
		if(newdepartmentName==null && newdepartmentName=="") {
			System.out.println("Appropriate message not updated the stored values:");
		}else {
			this.departmentName=newdepartmentName;
			
		}
	}
	public void staffDetails() {
		System.out.println("-------Staff profile has been created---------");
		System.out.println("Staff name: "+staffName);
		System.out.println("StaffId:"+staffId);
		System.out.println("Base shift: "+baseShift);
		System.out.println("DepartmentName: "+departmentName);
		System.out.println("Responsiblitity Level: "+responsibilityLevel);
		
	}
	
	
}

public class Hotel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter StaffName: ");
		String staffname=sc.nextLine();
		System.out.println("Enter Staff Id: ");
		int staffid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Base Shift: ");
		String baseshift=sc.nextLine();
		System.out.println("Department Name: ");
		String departmentname=sc.nextLine();
		System.out.println("Enter responsiblity level: ");
		String responsibilitylevel=sc.nextLine();
		
		DepartmentStaff obj=new DepartmentStaff(staffname, staffid, baseshift, departmentname, responsibilitylevel);
		
		boolean status=true;
		while(status) {
			System.out.println("---------MENU-------------");
			System.out.println("1.Update responsibility level "
					+ "\n2.Update department Name "
					+ "\n3.View staff profile details "
					+ "\n4.Exit the program ");
			
			
			System.out.println("Enter choice: ");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				
				System.out.println("Enter new responsibility level: ");
				String newresponsibility=sc.nextLine();
				obj.updateResponsibilityLevel(newresponsibility);
				System.out.println("responsibility Level Updated");
				break;
				
			case 2:
				
				System.out.println("Enter new department name:");
				String newdept=sc.nextLine();
				obj.updateDepartmentName(newdept);
				System.out.println("department name updated ");
				break;
				
			case 3:
				obj.staffDetails();
				break;
				
			case 4:
				System.out.println("Exit the program...");
				status=false;
				break;
				
				default:
					System.out.println("Invalid Choice");
					break;
			
			}
		}
		
		
		sc.close();

	}

}
