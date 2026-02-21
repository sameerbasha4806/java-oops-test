package com.annonymous;

class Student{
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}
}

interface Details{
	void getData(Student st);
}

public class Annonymous3 {

	public static void main(String[] args) {
		Student st=new Student("Sameer");
		Details d=new Details(){
			@Override
		public void getData(Student st) {
				System.out.println(st.name);
			}
		};
		d.getData(st);

	}

}
