package statements;

public class Temperature {
	public String temperatureCheck(int a) {
		if(a>30) {
			return "Hot";
					
		}else {
			return "cold";
		}
	}

	public static void main(String[] args) {
		Temperature obj = new Temperature();
		System.out.println(obj.temperatureCheck(25));

	}

}
