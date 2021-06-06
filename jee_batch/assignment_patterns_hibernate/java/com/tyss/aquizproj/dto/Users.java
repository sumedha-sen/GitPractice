package com.tyss.aquizproj.dto;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@Table
@Entity
public class Users implements Serializable{
	
	@Id
	@Column
	private int user_id;
	
	@Column
	private String username;
	
	@Column
	private String password;

}
