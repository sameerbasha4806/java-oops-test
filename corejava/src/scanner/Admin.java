package scanner;
import java.util.Scanner;

public class Admin {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		 int attempts=0;
		do {
			System.out.println("Enter User Name: ");
			String username=scanner.next();
			System.out.println("Enter password: ");
		    String password=scanner.next();	   
		  
		    if(username.equals("admin") && password.equals("admin@123")) {
		    	System.out.println("Login successfull");
		    	break;
		    }else {
		    	attempts++;
		    	System.out.println("Login Faild you have "+(3-attempts)+" attempts left");
		    }
		}while(attempts<3);
		
		if(attempts==3) {
			System.out.println("Attempts Exhausted You need to wait 24 hrs");
		}
		  scanner.close();
	

	}

}
