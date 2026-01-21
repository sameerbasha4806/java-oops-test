package elcBlc;

public class NaturalNumbers1 {
	public int getSumOfNaturalNumbers(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
		  sum=sum+i;
		}
		return sum;
		
	}

	public static void main(String[] args) {
		NaturalNumbers1 obj=new NaturalNumbers1();
		int result = new NaturalNumbers1().getSumOfNaturalNumbers(10);
		System.out.println(result);
		
	}

}
