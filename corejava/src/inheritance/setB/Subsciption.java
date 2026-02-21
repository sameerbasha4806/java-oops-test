package inheritance.setB;

import java.util.Scanner;

class SubscriptionPlan{
	String subscriberName;
	String planType;
	double planCost;
	double paidAmount;
	String SubscriptionStatus;
	
	public SubscriptionPlan(String subscriberName, String planType, double planCost) {
		super();
		this.subscriberName = subscriberName;
		this.planType = planType;
		this.planCost = planCost;
		this.paidAmount=0.0;
		this.SubscriptionStatus="Active";
	}
	
	public void updatePaidAmount(double newPaidAmount) {
		if(newPaidAmount<=0 || newPaidAmount>planCost) {
			System.out.println("Invalid payment");
		}else {
			paidAmount=newPaidAmount;
		}
	}
	
	public void changeSubscriptionStatus(String newSubscriptionStatus) {
		if(newSubscriptionStatus==null || newSubscriptionStatus.trim().isEmpty()) {
			System.out.println("Invalid subscription status");
		}else {
			SubscriptionStatus=newSubscriptionStatus;
		}
	}
	public void subscriptionSummary() {
		System.out.println("Subscriber name: "+subscriberName);
		System.out.println("Plan Type: "+planType);
		System.out.println("Plan Cost: "+planCost);
		System.out.println("Paid Amount: "+paidAmount);
		System.out.println(":subscription Status: "+SubscriptionStatus);
	}
	
}




public class Subsciption {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Subscriber Name: ");
		 String subscribername=sc.nextLine();
		System.out.println("Enter Plan Type: ");	
		String plantype=sc.nextLine();
		System.out.println("Enter plan Cost:");
		double plancost=sc.nextDouble();
		
		SubscriptionPlan sp=new SubscriptionPlan(subscribername,plantype , plancost);
		
		int choice=0;
		do {
			System.out.println(" ----------MENU-------------:\r\n"
					+ "1.Update Paid Amount\r\n"
					+ "2.Change Subscription Status\r\n"
					+ "3.View Subscription Summary\r\n"
					+ "4.Exit the program");
			
			System.out.println("Enter choice [1-4]");
			
			 choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter new paid amount: ");
				double paidamount=sc.nextDouble();
				sp.updatePaidAmount(paidamount);
				System.out.println("Successfully Updated Paid Amount");
				break;
				
			case 2:
				sc.nextLine();
				System.out.println("Enter to change subscription status: ");
				String status=sc.nextLine();
				sp.changeSubscriptionStatus(status);
				System.out.println("Successfully Updated Subscription Status ");
				break;
				
			case 3:
				sp.subscriptionSummary();
				break;
				
			case 4:
				System.out.println("Exit the program......");
				break;
				
				
				default :
					System.out.println("Invalid choice");
			}
		
			
		}while(choice!=4);
		
		sc.close();
		

	}

}
