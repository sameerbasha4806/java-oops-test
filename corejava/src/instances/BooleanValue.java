package instances;

public class BooleanValue {
	boolean b= true;
	public boolean getBooleanValue() {
		System.out.println(b);
		return b;
	}

	public static void main(String[] args) {
		BooleanValue obj = new BooleanValue();
		obj.getBooleanValue();//true
		obj.b=false;
		obj.getBooleanValue();//false
		System.out.println(obj.b);//false
		

	}

}
