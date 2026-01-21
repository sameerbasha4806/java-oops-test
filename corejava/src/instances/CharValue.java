package instances;

public class CharValue {
	char c='a';
	public char getCharValue() {
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		CharValue obj= new CharValue();
		
		obj.getCharValue();
		obj.c='b';
		System.out.println(obj.c);
		

	}

}
