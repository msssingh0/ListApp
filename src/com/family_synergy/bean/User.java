package com.family_synergy.bean;

//Bean class for user of the list

public class User 
{
	private int id;
	private String uname;
	private String upass;
	private String email;
	private int age;
	private String gender;
	
	public User(int id, String uname, String upass, String email, int age, String gender) 
	{
		super();
		this.id = id;
		this.uname = uname;
		this.upass = upass;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getUname()
	{
		return uname;
	}
	
	public void setUname(String uname)
	{
		this.uname = uname;
	}
	
	public String getUpass()
	{
		return upass;
	}
	
	public void setUpass(String upass)
	{
		this.upass = upass;
	}
	
	public String getEmail() 
	{
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	private boolean validateEmail(String email)
	{
		return false;
	}
	
	private boolean verifyEmail(String email)
	{
		return false;
	}
	
	private boolean validatePassword(String password)
	{
		return false;
	}
	
}
