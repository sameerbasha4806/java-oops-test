package statements;

public class SwitchDay {

	public static void main(String[] args) {
		String day ="monday" ;
		switch (day) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println("Uff, it's weekday");
			break;
			
		case "saturday":
		case "sunday":
			System.out.println("Yayy, it's a weekend");
			break;
			default:
				System.out.println("invalid day");
				break;
				
				
			
		}


	}

}
