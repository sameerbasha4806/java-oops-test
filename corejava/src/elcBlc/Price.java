package elcBlc;

public class Price {
	
	public double totalPrice(double p1,double p2, double p3) {
		
		return p1+p2+p3;
		
	}
	public double average(double p1,double p2,double p3) {
		double total=totalPrice(p1,p2,p3);
		return total /3.0;
		
	}	
	
	public static void main(String[] args) {
		Price obj1=new Price();
		Price obj2=new Price();
		
		System.out.println("average: "+obj1.average(1000.0, 2000.0, 3000.0) );
		System.out.println("total: "+ obj2.totalPrice(1000.0, 2000.0, 3000.0));
		
	}

}

