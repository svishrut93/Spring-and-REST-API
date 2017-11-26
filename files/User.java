package com.tweleve.springboot.twelve.user;
import java.util.Date;

public class User {
	
	private Integer id ; 
	private String name ; 
	private Date birthDate;
	
	
	protected User()
	{
		
	}
	public User(Integer id , String name , Date birthDate) {
		super();
		this.id = id ; 
		this.name = name; 
		this.birthDate = birthDate;
		
		// TODO Auto-generated constructor stub
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Date getBirthDate() {
		return birthDate;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}



	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}


}
