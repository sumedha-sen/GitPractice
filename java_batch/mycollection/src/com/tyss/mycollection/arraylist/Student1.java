package com.tyss.mycollection.arraylist;

public class Student1 implements Comparable<Student1> {
	int id;
	String name;
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}

}
