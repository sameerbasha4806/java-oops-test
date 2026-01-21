package loops;

public class Even {
	public void getEven(int num) {
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
	}

	public static void main(String[] args) {
		 Even obj = new Even();
		 obj.getEven(200);

	}

}
