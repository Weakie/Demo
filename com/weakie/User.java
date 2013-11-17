package com.weakie;

public class User{
	private	int age = 10;
	private String name = "shun yuan hui";

	public User(){
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
}
