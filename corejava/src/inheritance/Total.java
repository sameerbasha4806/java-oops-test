package inheritance;

class Employee{
		 double salary=50000.0;
	}
	class Manager extends Employee{
		double bonus=20000.0;
		public void printtotalSalary() {
			double totalSalary=salary+bonus;
			System.out.println("total Salary: "+totalSalary);
		}
	
	}
	 
   	  public class Total { 
		public static void main(String[] args) {
			Manager man=new Manager();
			man.printtotalSalary();

		}
	
	}	
