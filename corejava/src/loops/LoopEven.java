package loops;

public class LoopEven {
	public void even() {
		for(int i=2;i<=20;i+=2) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		LoopEven obj= new LoopEven();
		obj.even();

	}

}
