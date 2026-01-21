package statements;

public class Divisibility {
	public boolean isDivisibleBy5(int num) {
		if(num%5==0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Divisibility obj=new Divisibility();
		System.out.println("Is 15 divisible by 5?: "+obj.isDivisibleBy5(16));

	}

}
