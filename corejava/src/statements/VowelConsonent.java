package statements;

public class VowelConsonent {
	public static String vowelOrConsonent(char c) {
		if (c=='a' || c=='e' ||c=='i'||c=='o'||c=='u') {
			return "vowel";
		}else if (c>='a' && c<='z') {
			return "consonent";
		}
		return "invalid";
		
	}

	public static void main(String[] args) {
		String result=vowelOrConsonent('u');
		System.out.println(result);
		System.out.println();
		
	}

}
