package com.technoaps.test.model;

import java.io.Serializable;

public class Student implements Serializable{
	
	private String name;
	private int id;
	private String city;
	private String zip;
	
	public Student(){
		
	}
	
	
	public Student(String name, int id, String city, String zip) {
		super();
		this.name = name;
		this.id = id;
		this.city = city;
		this.zip = zip;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	

}
