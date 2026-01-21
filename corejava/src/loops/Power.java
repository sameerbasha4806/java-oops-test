package loops;

public class Power {
	public int getPower(int base,int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
		}
		return power;
	}

	public static void main(String[] args) {
		Power obj = new Power();
	System.out.println(obj.getPower(2, 3));	

	}

}
