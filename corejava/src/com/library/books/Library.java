package com.library.books;

public class Library {
	private String libraryName;
	private int totalBooks;
	
	public String getlibraryname() {
		return libraryName;
	}
	public int gettotalbooks() {
		return totalBooks;
	}
	public void setlibraryname(String libraryName) {
		this.libraryName=libraryName;
	}
	public void settotalbooks(int totalBooks) {
		this.totalBooks=totalBooks;
	}
	public void showLibraryDetails() {
		System.out.println("libraryName: "+libraryName);
		System.out.println("libraryName: "+totalBooks);
	}

}
