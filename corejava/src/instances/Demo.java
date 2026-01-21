package instances;

public class Demo {

	public byte getByteValue(byte a) {
		return a;
	}
	
	public static void main(String[] args) {
		Demo obj1 = new Demo();
		byte result = obj1.getByteValue((byte) 12);
		System.out.println(result);
		
		
		
		
	}

}
