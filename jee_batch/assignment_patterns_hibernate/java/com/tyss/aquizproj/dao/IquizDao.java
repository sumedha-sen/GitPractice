package com.tyss.aquizproj.dao;

import com.tyss.aquizproj.dto.Users;

public interface IquizDao {
	public Users getRegister(int id,String name,String password);
	public Users getLogin(String name,String password);

}
