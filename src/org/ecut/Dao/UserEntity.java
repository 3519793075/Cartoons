package org.ecut.Dao;

public class UserEntity {
	private String usrname;
	private String pwd;
	public String getUsrname() {
		return usrname;
	}
	public void setUsrname(String usrname) {
		this.usrname = usrname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	//带参构造函数
	public UserEntity(String usrname, String pwd) {
		super();
		this.usrname = usrname;
		this.pwd = pwd;
	}
	public UserEntity() {
	}
}
