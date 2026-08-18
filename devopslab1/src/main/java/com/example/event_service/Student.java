package com.example.event_service;

public class Student {
	private String name;
	private String email;
	private String event;
	private String college;
	
	public Student() {
	}
	public Student(String name,String email,String event, String college) {
		this.name=name;
		this.email=email;
		this.event=event;
		this.college=college;
		
	}
	public String getName() {
		return name;
	}
	public void setName() {
		this.name= name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail() {
		this.email=email;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent() {
		this.event=event;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege() {
		this.college=college;
	}
}
