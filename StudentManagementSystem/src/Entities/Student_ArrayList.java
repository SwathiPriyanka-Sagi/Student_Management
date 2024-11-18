package Entities;

import java.util.ArrayList;

public class Student_ArrayList{
	private ArrayList <Student> students;
	
	public Student_ArrayList() {
		students = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public Student updateStudent(String id, String name, int age) {
		for (int i = 0; i < students.size(); i++) {
	        Student student = students.get(i);
	        if (student.getId() == id) {
	            student.setName(name);
	            student.setAge(age);
	            return student;
	        }
	    }
		return null;
    }
	public Student findStudent(String id) {
		for (int i = 0; i < students.size(); i++) {
		    Student student = students.get(i);
		    if (student.getId().equals(id)) {
		        return student;
		    }
		}
		return null;
	}
	public Student deleteStudent(String id) {
	    for (int i = 0; i < students.size(); i++) {
	        Student student = students.get(i);
	        if (student.getId() == id) {
	            students.remove(i);
	            return student;
	        }
	    }
		return null;
	}
	
	public void printStudentDetails() {
		for(int i = 0 ; i <= students.size()-1 ; i++)
		{
			System.out.println(students.get(i));
		}
	}

}
