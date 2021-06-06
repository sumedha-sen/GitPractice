package com.tyss.mycollection.arraylist;

public class Person implements Comparable<Person> {
	
    int id;
    String name;
	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
}
