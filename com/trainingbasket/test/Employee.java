package com.trainingbasket.test;

public class Employee {

	int id;
	int age;
	String name;
	String contactNumber;
	
	static int tempId=0;
	
	public Employee() {
		id=++tempId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id " + this.id + "Name : " + this.name + "Age : " + this.age + "Contact Number : " + this.contactNumber;
	}

	/*
	 * public Employee(int age, String name, String contactNumber) { id=++id;
	 * this.age=age; this.name=name; this.contactNumber=contactNumber; }
	 * 
	 */
}
