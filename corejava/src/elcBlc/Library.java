package elcBlc;

class Book{
	String title;
	String author;
}

public class Library {
	public void addBook(Book b) {
		System.out.println("Book added: "+b.title+": The Complete Reference By "+b.author);
	}

	public static void main(String[] args) {
		Book obj=new Book();
		obj.title="java";
		obj.author="Herbert Schildt";
		Library obj2=new Library();
		obj2.addBook(obj);

	}

}
