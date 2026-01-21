package statements;

public class MovieTheatre {
	public double getTicketPrice(int age) {
		if(age<5) {
			return 0.0;
		}else if(age>=5 && age<=12) {
			return 5.0;
		}else if(age>=13 && age<=60) {
			return 10.0;
		}else if(age>60) {
			return 10.0*0.50;
		}else {
			return 1;
		}
			
		
	}

	public static void main(String[] args) {
		double result =new MovieTheatre().getTicketPrice(61);
		System.out.println(result);
		

	}

}
