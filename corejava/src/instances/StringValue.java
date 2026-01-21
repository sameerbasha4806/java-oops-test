package instances;

public class StringValue {
	String s ="My Name Is Sameer";
	public String getStringValue() {
		return s;
	}

	public static void main(String[] args) {
		StringValue obj = new StringValue();
		System.out.println(obj.s);
		
	}

}
