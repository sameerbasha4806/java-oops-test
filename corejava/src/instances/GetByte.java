package instances;

public class GetByte {
	byte b;
	public byte getByteValue() {
		return b;
		
	}

	public static void main(String[] args) {
		GetByte obj1 = new GetByte();
		obj1.b=12;
		System.out.println(obj1.b);
	}

}
