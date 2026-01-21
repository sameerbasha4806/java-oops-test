package statements;

public class PassOrFail {
	public String displayResult(int marks) {
		if(marks>=35) {
			return "Pass";
		}
		return "fail";		
	}

	public static void main(String[] args) {
		PassOrFail obj=new PassOrFail();
		String result=obj.displayResult(30);
		System.out.println(result);
		

	}

}
