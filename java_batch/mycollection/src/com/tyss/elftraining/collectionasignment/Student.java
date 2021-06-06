package com.tyss.elftraining.collectionasignment;

public class Student implements Comparable<Student> {
	
  int id;
  String name;
  int marks;
  int standard;
  int age;
   public Student(int id, String name, int marks, int standard, int age) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
	this.standard = standard;
	this.age = age;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", standard=" + standard + ", age=" + age
			+ "]";
}
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return this.hashCode()-o.hashCode();
}
@Override
public int hashCode() {
	
	return this.id;
}



}
