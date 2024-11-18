package Entities;

import java.util.ArrayList;

public class Teacher_ArrayList{
	String courseName;
	
	private ArrayList <Teacher> teachers;
	public Teacher_ArrayList() {
		teachers = new ArrayList<Teacher>();
	}
	
	public Teacher_ArrayList(String courseName) {
		teachers = new ArrayList<Teacher>();
		this.courseName = courseName;
	}
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	public Teacher findTeacher(String id) {
		for(int i = 0; i <teachers.size(); i++ ) {
			Teacher teacher = teachers.get(i);	
			if(teacher.getId().equals(id)) {
				return teacher;
			}
		}
		return null;
	}
	public Teacher removeTeacher(String id) {
		for(int i = 0; i <teachers.size(); i++ ) {
			Teacher teacher = teachers.get(i);	
			if(teacher.getId().equals(id)) {
				return teacher;
			}
		}
		return null;
	}
	public void printTeacherDetails() {
		for(int i = 0 ; i <= teachers.size()-1 ; i++)
		{
			System.out.println(teachers.get(i));
		}
	}
	

}
