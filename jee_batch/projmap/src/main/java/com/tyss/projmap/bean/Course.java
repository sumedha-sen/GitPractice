package com.tyss.projmap.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString.Exclude;


@Data
@Entity
@Table(name="course")
public class Course implements Serializable {
	
	
	@Id
	@Column
	int cid;
	
	@Column
	String cname;
	
	@Exclude
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="course")
	private List<Student> student;

}
