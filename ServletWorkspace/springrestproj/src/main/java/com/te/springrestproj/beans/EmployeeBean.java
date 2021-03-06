package com.te.springrestproj.beans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

import lombok.Data;

@Data
@Entity
@Table(name="employee")
@XmlRootElement(name="employee")
@JsonRootName("employee")
@JsonPropertyOrder({"id","name"})
public class EmployeeBean implements Serializable {
	@JsonProperty("emp_id")
	@Id
	@Column(name="userid")
	private Integer id;
	
	@Column(name="username")
	@JsonProperty
	private String name;
	
	@Column(name="dob")
	@JsonProperty
	private Date dob;
	
	
	@JsonIgnore
	@XmlTransient
	@Column
	private String password;

}
