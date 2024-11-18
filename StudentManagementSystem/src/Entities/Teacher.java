package Entities;

import java.util.ArrayList;

public class Teacher extends Person{
	
	String courseName;	
	
	public Teacher(String id, int age, String name, String courseName) {
		super(id, age, name);
		this.courseName = courseName;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourse(String courseName) {
		this.courseName = courseName;
	}
	
	public String toString() {
		return "Teacher [" + super.toString() + " courseName " +courseName +"]";
	}
	
	
	

	
	

	
	
	
	
}
