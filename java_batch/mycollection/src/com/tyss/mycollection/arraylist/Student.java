package com.tyss.mycollection.arraylist;

import java.util.Comparator;

public class Student implements Comparator<Student> {
 int rollno;
 String name;
 
 public Student() {
		
	}
 public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", name=" + name + "]";
}

@Override
public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	return o1.hashCode()-o2.hashCode();
}
@Override
public int hashCode() {
	return this.rollno;
}

}

