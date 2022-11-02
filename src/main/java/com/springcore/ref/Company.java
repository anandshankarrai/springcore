package com.springcore.ref;

public class Company {

	private String name;
	private Emp emp;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

//	Company(String name , Emp emp){
//		this.name = name;
//		this.emp = emp;
//	}
//
//	public Company() {
//		super();
//	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", emp=" + emp + "]";
	}
	
	
	
	
}
