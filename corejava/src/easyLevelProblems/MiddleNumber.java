package easyLevelProblems;

public class MiddleNumber {
	public void middle(int num) {
		int count =0;
		while(num>0) {
			count++;
			num/=10;
		}
		System.out.println(count);
	}
	

	public static void main(String[] args) {
		MiddleNumber obj=new MiddleNumber();
		obj.middle(2344);

	}

}
