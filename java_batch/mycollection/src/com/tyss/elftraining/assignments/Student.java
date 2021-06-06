package com.tyss.elftraining.assignments;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double marks;
	int Age;
	public Student() {
		super();
	}
	public Student(int id, String name, double marks, int age) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		Age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", Age=" + Age + "]";
	}
	@Override
	public int compareTo(Student o) {
		
		return this.id-o.id;
	}
	
	
}

