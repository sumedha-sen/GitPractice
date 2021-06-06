package com.tyss.aquizproj1.dao;

import com.tyss.aquizproj1.dto.Users;

public interface Iquiz {

	public Users register(int id, String name, String pass);

	public Users login(String name, String pass);

	

}
