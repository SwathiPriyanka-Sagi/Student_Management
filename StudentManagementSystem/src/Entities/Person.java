package Entities;

public class Person {
	
	String id;
	int age;
	String name;
	
	
	public Person(String id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = this.id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Age: " + age);
		
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	

}
