package statements;

public class LargestNumber {

	public int largestOfThreeNumbers(int a, int b, int c) {
		if(a>b) {
			if(a>c) {
				return a;
			}else {
				return c;
			}
		}else {
			if(b>c) {
				return b;
			}else {
				return c;
			}
		}
			
			
		}
	

	public static void main(String[] args) {
		LargestNumber obj=new LargestNumber();
		
		int result=obj.largestOfThreeNumbers(10, 20, 30);
		System.out.println(result);
		

	}

}
