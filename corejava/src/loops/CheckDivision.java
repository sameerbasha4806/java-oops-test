package loops;

public class CheckDivision {
	public void getDivision() {
		for(int i=100;i>=1;i--) {
			if(i%3==0 && i%5==0 ) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		CheckDivision obj = new CheckDivision();
		obj.getDivision();
		
	}

}
