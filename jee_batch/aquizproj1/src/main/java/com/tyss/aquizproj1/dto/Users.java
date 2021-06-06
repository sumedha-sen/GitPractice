package com.tyss.aquizproj1.dto;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Data
@Table
@Entity
public class Users implements Serializable {
	@Id
	@Column(name = "user_Id")
	private int userId;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;

}
