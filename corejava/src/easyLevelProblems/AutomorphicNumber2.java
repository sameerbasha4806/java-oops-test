package easyLevelProblems;

public class AutomorphicNumber2 {
	public static boolean isAutomorphic(int num) {
		int square=num*num;
		int temp=num;
		while(temp>0) {
			if(square%10 != temp%10) {
				return false;
			}
			square/=10;
			temp/=10;
		}
		return true;
		
	}

	public static void main(String[] args) {
		AutomorphicNumber2 obj = new AutomorphicNumber2();
		System.out.println(obj.isAutomorphic(76)?"Automorphic Number":"Not a Automorphic Number");

	}

}
