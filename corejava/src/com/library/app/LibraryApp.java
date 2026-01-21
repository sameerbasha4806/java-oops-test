package com.library.app;
import com.library.books.Library;
import com.library.staff.Librarian;

public class LibraryApp {

	public static void main(String[] args) {
		Library obj1=new Library();
		Librarian obj2=new Librarian();
		obj1.setlibraryname("Jntuh Library");
		obj1.settotalbooks(50);
		obj2.setlibrarianName("Srinu");
		obj2.setyearsofExperience(20);
		obj1.showLibraryDetails();
		obj2.showLibrarianInfo();

	}

}
