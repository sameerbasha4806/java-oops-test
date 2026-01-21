package loops;

public class ReverseWhile {
	public void reverse(int num) {
		while(num>=1) {
			System.out.println(num);
			num--;
		}
	}

	public static void main(String[] args) {
		ReverseWhile obj = new ReverseWhile();
		obj.reverse(5);
	}

}
