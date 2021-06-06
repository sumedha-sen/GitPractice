package com.tyss.designpatternproj.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "primary_info")
public class Primary_Info implements Serializable {

	@Id
	@Column
	private int id;

	@Column
	private String name;

	@Column
	private Date dob;

	@Column
	private long phoneno;

}

