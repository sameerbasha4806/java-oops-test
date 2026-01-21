package loops;

public class UglyNumber {
	public boolean isUgly(int num) {
		if(num<=0) {
			return false;
		}
		while(num>0) {
			if(num%2==0) {
				return true;
			}
			else if(num%3==0){
				return true;
			}
			else if(num%5==0) {
				return true;
			}
		}
		return num==1; 
	}

	public static void main(String[] args) {
		UglyNumber obj=new UglyNumber();
		System.out.println(obj.isUgly(18)?"It is a UglyNumber":"Not a UglyNumber");
		
	}

}
