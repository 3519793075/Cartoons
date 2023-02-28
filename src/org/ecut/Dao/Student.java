package org.ecut.Dao;

public class Student {
	private String name;
	private String pwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Student(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}
	public Student() {
	}
	

}
