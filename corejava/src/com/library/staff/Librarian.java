package com.library.staff;

public class Librarian {
	private String librarianName;
	private int yearsOfExperience;
	
	public String getlibrarianName() {
		return librarianName;
	}
	public int getyearsofExperience() {
		return yearsOfExperience;
	}
	public void setlibrarianName(String librarianName) {
		this.librarianName=librarianName;
	}
	public void setyearsofExperience(int yearsOfExperience) {
		this.yearsOfExperience=yearsOfExperience;
	}
	public void showLibrarianInfo() {
		System.out.println("librarianName: "+librarianName);
		System.out.println("yearsofExperience: "+yearsOfExperience);
	}

}
