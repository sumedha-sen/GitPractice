package com.tyss.designpatternproj.dao;

import com.tyss.designpatternproj.dto.Movies;

public interface MoviesDAO {

	public  Movies getSingleRecord();

	public void getAllRecords();

	public void insertRecord( Movies info);

}



