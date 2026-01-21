package instances;

public class Library {
	
	public static String libraryName;
	String title;
	String author;
	public void displayInfo() {
		System.out.println("Library Name: "+libraryName);
		System.out.println("Book Title: "+title);
		System.out.println("Book Author: "+author);
		System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {
		Library obj = new Library();
		Library.libraryName="City Public Library";
		obj.title="The Great Gatsby";
		obj.author="F.Scott Fitzgerald";
		obj.displayInfo();
		Library obj2 = new Library();
		obj2.title="1984";
		obj2.author="George Orwell";
		obj2.displayInfo();

	}

}
