package statements;

public class WeekDay {

	public static void main(String[] args) {
		int day = 5;
		switch(day) {
		case 1:
		System.out.println("This is sunday");
			break;
		case 2:
			System.out.println("this is monday");
			break;
		case 3:
			System.out.println("this is tuesday");
			break;
			case 4:
				System.out.println("this is wednesday");
				break;
			case 5:
				System.out.println("this is thursday");
				break;   
			case 6:
				System.out.println("this is friday");
				break;
			case 7:
				System.out.println("this is saturday");
				break;
				default:
					
					System.out.println("not a valid day number");
					break;
				
		}	
		
	}
//	if(department.equals("IT")) {
//		return fee-(fee*0.10);
//	}else {
//		return fee;
//	}

}

