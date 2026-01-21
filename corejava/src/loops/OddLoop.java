package loops;

public class OddLoop {
    public void oddNumbers() {
    	for(int i=1;i<=15;i+=2) {
    		System.out.println(i);
    	}
    }

	public static void main(String[] args) {
		OddLoop obj = new OddLoop();
		obj.oddNumbers();
	}

}
