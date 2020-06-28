package org.foreachjava8.model;

public class Student {
	int roleNumber;
	String name;
	
	public Student(int roleNumber,String name){
		this.roleNumber=roleNumber;
		this.name=name;
	}
	
	public int getRoleNumber() {
		return roleNumber;
	}
	public void setRoleNumber(int roleNumber) {
		this.roleNumber = roleNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
	

}
