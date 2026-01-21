package statements;

public class PositiveNegative {
	public String findPostiveOrNegative(int a) {
		if(a<0) {
			return "negative";
		}else if(a>0){		
			return "positive";
		}else {
		return "neither negative nor positive";
	}
	}
	public static void main(String[] args) {
		PositiveNegative obj = new PositiveNegative();
		String result=obj.findPostiveOrNegative(0);
		System.out.println(result);	

	}

}
