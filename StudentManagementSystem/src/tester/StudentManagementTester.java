package tester;

import java.util.ArrayList;

import java.util.Scanner;

import Entities.Student;
import Entities.Student_ArrayList;
import Entities.Teacher;
import Entities.Teacher_ArrayList;



public class StudentManagementTester {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Student_ArrayList sa = new Student_ArrayList();
		Teacher_ArrayList ta = new Teacher_ArrayList();
		//Course_ArrayList ca = new Course_ArrayList();
		boolean isPresent = true;
		while(true) {
			System.out.println("Students Details Form");
			System.out.println("1. Add Student");
			System.out.println("2. Delete Student");
			System.out.println("3. Update Student");
			System.out.println("4. Print All  Students");
			System.out.println("Teacher Details Form");
			System.out.println("5. Add Teacher");
			System.out.println("6. Delete Teacher");
			System.out.println("7. Update Teacher");
			System.out.println("8. Print All Teacher");
			System.out.println("0. Exit");
			System.out.println("Enter your choice:");
			
			int choice = sc.nextInt();
			//adding
			if(choice == 1) {
				System.out.println("Enter Student Id: ");
				String id = sc.next();
				sc.nextLine();
				System.out.println("Enter Student Age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Student Name: ");
				String name = sc.next();
				sc.nextLine();
				sa.addStudent(new Student(id, age, name));
				System.out.println("Student added Successfully");
			} //delete 
			else if (choice == 2) {
	            System.out.print("Enter student ID to delete: ");
	            String id = sc.next();
	            sa.deleteStudent(id);
	            System.out.println("Student deleted successfully.");
			} //findStudent
			else if(choice == 3) {
				System.out.println("Enter Student Id to findOut ");
				String id = sc.next();
				sa.findStudent(id);
				System.out.println("Updated Student Details Successfully");
			}//PrintDetails
			else if(choice == 4) {
				sa.printStudentDetails();
			}
			
		//	int TeacherChoice = sc2.nextInt();
			//adding
			if(choice == 5) {
				System.out.println("Enter Teacher Id: ");
				String id = sc.next();
				sc.nextLine();
				System.out.println("Enter Teacher Age: ");
				int age = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Teacher Name: ");
				String name = sc.next();
				sc.nextLine();
				System.out.println("Enter Course Name");
				String courseName = sc.nextLine();
				ta.addTeacher(new Teacher(id, age, name, courseName));
				System.out.println("Teacher added Successfully");
			} //delete 
			else if (choice == 6) {
	            System.out.print("Enter Teacher ID to delete: ");
	            String id = sc.next();
	            ta.removeTeacher(id);
	            System.out.println("Teacher deleted successfully.");
			}
			//findTeacher
			else if(choice == 7) {
				System.out.println("Enter Teacher Id to findOut ");
				String id = sc.next();
				ta.findTeacher(id);
				System.out.println("Updated Teacher Details Successfully");
			}//PrintDetails
			else if(choice == 8) {
				ta.printTeacherDetails();
			}
			else if(choice == 0) {
				System.out.println("Exiting.....");
				 isPresent= false;
				 sc2.close();
			} 
			//				 else {
//				System.out.println("Invalid Option... Please try again Later");
//			}
			
		}
			
	}

}
