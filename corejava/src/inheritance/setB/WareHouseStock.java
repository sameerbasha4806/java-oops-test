package inheritance.setB;

import java.util.Scanner;

class StockHolder{
	String handlerName;
	String handlerId;
	public StockHolder(String handlerName, String handlerId) {
		super();
		this.handlerName = handlerName;
		this.handlerId = handlerId;
	}
	
	
}
class StockPerformance extends StockHolder{

	int listOfStockQuantities;
	int TotalStockHandled;
	double AverageStockPerEntry;
	String handlingGrade;
	int total=0;
	public StockPerformance(String handlerName, String handlerId) {
		super(handlerName, handlerId);
		this.listOfStockQuantities=listOfStockQuantities;
		this.TotalStockHandled=TotalStockHandled;
		this.AverageStockPerEntry=AverageStockPerEntry;
		this.handlingGrade=handlingGrade;
	}
	public void addStock(double sqty) {
		if(sqty>=0) {
			total+=sqty;
		}else {
			System.out.println("No valid");
		}
	}
	public void reCalculate(int count) {
		this.TotalStockHandled=total;
		this.AverageStockPerEntry=this.TotalStockHandled/count;
		if(this.AverageStockPerEntry>=0 && this.AverageStockPerEntry<10) {
			this.handlingGrade="Not satisfied";
		}
		else if(this.AverageStockPerEntry>=10 && this.AverageStockPerEntry<20) {
			this.handlingGrade="Need Improvement";
		}
		else if(this.AverageStockPerEntry>=20 && this.AverageStockPerEntry<40) {
			this.handlingGrade="Satisfied";
		}
		else if(this.AverageStockPerEntry>=40 && this.AverageStockPerEntry<70) {
			this.handlingGrade="Efficient";
		}
		else if(this.AverageStockPerEntry>=70){
			this.handlingGrade="Excellent";
		}
	}
	public void viewDetails() {
		System.out.println("-------Performance Summary------------");
		System.out.println("Handler Name: "+handlerName);
		System.out.println("Handler Id: "+handlerId);
		System.out.println("Total Stock Handled : "+this.TotalStockHandled);
		System.out.println("Average Stock Per Entry : "+this.AverageStockPerEntry);
		System.out.println("Handling Grade : "+this.handlingGrade);
	}
	
}
	
	
	


public class WareHouseStock {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Handler Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Handler Id: ");
		String id=sc.nextLine();
		
		StockPerformance sp=new StockPerformance(name, id);
		
		int count=0;
		int choice=0;
		boolean status=true;
		while(status) {
			System.out.println("------------------MENU-----------:\r\n"
					+ "1.Add Stock Entry\r\n"
					+ "2.Recalculate Performance Result\r\n"
					+ "3.View Stock Performance Summary\r\n"
					+ "4.Exit the program");
			System.out.println("Enter your choice[1-4]");
			
			 choice=sc.nextInt();
			switch(choice) {
			
		case 1: 
			System.out.println("Enter Stock Quantity : ");
			int qty=sc.nextInt();
			sp.addStock(qty);
			count++;
			break;
		case 2: 
			sp.reCalculate(count);
			System.out.println("ReCalculation Done Successfully");
			break;
		case 3:
			sp.viewDetails();
			break;
		case 4:
			System.out.println("Thank You");
			break;
		default:System.out.println("Invalid Choice");
		}
	}while(choice!=4);
	sc.close();
			
			
			
		}
		

	}


