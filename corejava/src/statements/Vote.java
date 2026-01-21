package statements;

public class Vote {
	public boolean canVote(int age) {
		if(age>=18) {
			return true;
		}
		if (age<18) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Vote obj=new Vote();
		System.out.println("Can vote (age 20)? "+obj.canVote(20));
		

	}

}
