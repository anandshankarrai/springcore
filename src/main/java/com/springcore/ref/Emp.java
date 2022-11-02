package com.springcore.ref;

public class Emp {
	
	private String nameOfEmp;

	public String getNameOfEmp() {
		return nameOfEmp;
	}

	public void setNameOfEmp(String nameOfEmp) {
		this.nameOfEmp = nameOfEmp;
	}

	public Emp(String nameOfEmp) {
		super();
		this.nameOfEmp = nameOfEmp;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [nameOfEmp=" + nameOfEmp + "]";
	}
	
	
	
	
}
