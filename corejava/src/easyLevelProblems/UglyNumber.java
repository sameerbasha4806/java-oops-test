package easyLevelProblems;

public class UglyNumber {
	public boolean isUgly(int num) {
		while(num>0) {
			if(num%2==0) {
				num/=2;
			}else if(num%3==0) {
				num/=3 ;
			}else if(num%5==0) {
				num/=5;
			}else {
			  break;
			}
	}
		return num==1;
}

	public static void main(String[] args) {
		UglyNumber obj=new UglyNumber();
		System.out.println(obj.isUgly(30)?"It Is Ugly Number":"Not A Ugly Number");

	}

}
