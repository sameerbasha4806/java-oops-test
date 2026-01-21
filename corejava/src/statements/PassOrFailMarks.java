package statements;

public class PassOrFailMarks {
	public String getmarks(int marks) {
		if(marks>35) {
			if(marks>75) {
				return "Distinction";
			}else {
				return "pass";
			}
		}else {
			return "fail";
		}
	}			
	public static void main(String[] args) {
		PassOrFailMarks obj = new PassOrFailMarks();
		System.out.println(obj.getmarks(90));
		System.out.println(obj.getmarks(40));
		System.out.println(obj.getmarks(30));

	}

}
