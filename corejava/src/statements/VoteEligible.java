package statements;

public class VoteEligible {
	static int a;

	public static String checkVoteEligible(int num) {
		a=num;
		if(num>=18) {
			return "Eligible for Voting";
			
		}else {
			return "Not Eligible";
			
		}
	}

	public static void main(String[] args) {
		String result =checkVoteEligible(18);
		System.out.println(result);
		

	}

}
