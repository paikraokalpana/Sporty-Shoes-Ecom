package com.sporty.shoes.ShoesModel;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_userinfo")
public class UserInfoModel {
	@Id
	@GeneratedValue
	private int id;
	private String firstname;
	private String lastname;
	private String password;
	private int rollid;
	private long phno;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRollid() {
		return rollid;
	}
	public void setRollid(int rollid) {
		this.rollid = rollid;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserInoModel [firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
				+ ", rollid=" + rollid + ", phno=" + phno + ", email=" + email + "]";
	}
	public UserInfoModel() {
		
	}
	public UserInfoModel(String firstname, String lastname, String password, int rollid, long phno, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.rollid = rollid;
		this.phno = phno;
		this.email = email;
	}
	

}
