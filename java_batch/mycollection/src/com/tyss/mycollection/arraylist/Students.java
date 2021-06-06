package com.tyss.mycollection.arraylist;

public class Students implements Comparable<Students> {
    int id;
    String name;
    int standard;
    double marks;
    
    public Students() {
    	super();
    }
    

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", standard=" + standard + ", marks=" + marks + "]";
	}


	public Students(int id, String name, int standard, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.marks = marks;
	}


	


	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}


	@Override
	public int hashCode() {
		
		return this.id;
	}


	@Override
	public boolean equals(Object obj) {
		Students student=(Students) obj;
        return this.id==student.id;
//		return this.name==student.name;
		
	}
	
	

	
}
