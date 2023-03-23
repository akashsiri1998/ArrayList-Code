package com.infosys;

public class encp_1 {
	private String name;
	private int salary;
	 private int empid;
	static private String country= "india";
	
	public void setName(String nm) {
		this.name=nm;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int sal) {
		this.salary=sal;
	}
	public int getSalary() {
		return salary;
	}
	public void setEmpid(int id) {
		this.empid=id;
		
	}
	public int getEmpid() {
		return empid;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public String getCountry() {
		return country;
	}
	

}
