package com.tyss.projmap.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString.Exclude;


@Data
@Entity
@Table(name="student")
public class Student implements Serializable {
	
	
	@Id
	@Column
	int sid;
	
	@Column
	String sname;
	
	
	@Exclude
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="course_student_info",joinColumns=@JoinColumn(name="sid"),inverseJoinColumns=@JoinColumn(name="cid"))
	private List<Course> course;

}
