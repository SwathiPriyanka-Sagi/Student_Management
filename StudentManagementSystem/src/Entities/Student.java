package Entities;

public class Student extends Person{
	
	//private double grades;
		
	public Student(String id, int age, String name) {
		super(id, age, name);
		//this.grades = grades;
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

//	public double getGrades() {
//		return grades;
//	}
//	public void setGrades(double grades) {
//		this.grades = grades;
//	}

	@Override
	public String toString() {
		return "Student [" + super.toString() + "]";
	}
	
	
	
	
	
	

}
