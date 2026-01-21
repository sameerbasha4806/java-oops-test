package statements;

public class Temperatures {
	public String getTemperature(int temp) {
		if(temp<0) {
			return "The Temperature Is Cold";
		}else if (temp<20) {
			return "The Temperature Is Warm";
		}else{
			return "The Temperature Is Hot";
		}
}		

	public static void main(String[] args) {
		String result= new Temperatures().getTemperature(200);
		System.out.println(result);
		

	}

}
