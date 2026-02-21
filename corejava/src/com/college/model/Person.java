package com.college.model;

public class Person{
	private String name;
	private int age;
	private long contactNumber;
	
	
	public Person() {
		super();
		
	}

	public Person(String name,int age,long contactNumber) {
		this.name=name;
		this.age=age;
		this.contactNumber=contactNumber;
	}

	public String getName() {
		return name;
	}
	
	public long getAge() {
		return age;
	}
	
	public long getContactNumber() {
		return contactNumber;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setContactNumber(long contactNumber) {
		this.contactNumber=contactNumber;
	}
}


