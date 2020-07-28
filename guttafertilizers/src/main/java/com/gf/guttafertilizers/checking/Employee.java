package com.gf.guttafertilizers.checking;

public class Employee {
	
	private String empid;
	private String empname;
	private String emploc;
	private String empphoneno;
	
	Employee(String empid, String empname, String emploc, String empphoneno){
		this.empid = empid;
		this.empname = empname;
		this.emploc = emploc;
		this.empphoneno = empphoneno;
	}
	
	Employee(){
		
	}
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmploc() {
		return emploc;
	}
	public void setEmploc(String emploc) {
		this.emploc = emploc;
	}
	public String getEmpphoneno() {
		return empphoneno;
	}
	public void setEmpphoneno(String empphoneno) {
		this.empphoneno = empphoneno;
	}
	
	

}
