package com.tyss.designpatternproj.factory;

import com.tyss.designpatternproj.dao.MoviesDAO;
import com.tyss.designpatternproj.dao.MoviesDaoHibImpl;
import com.tyss.designpatternproj.dao.MoviesDaoJdbcImpl;

public class GetDaoImpl {
//	
//	String type="jdbc";
//	public MoviesDAO getDAOImpl(){
//		
//		if(type.equalsIgnoreCase("jdbc")) {
//			return (MoviesDAO) new MoviesDaoJdbcImpl();
//		}else if(type.equalsIgnoreCase("hibernate")) {
//			
//			return new MoviesDaoHibImpl();
//			
//		}else if(type.equalsIgnoreCase("springjdbc")) {
//			return new EmployeeDaoSpringJdbcImpl();
//			
//			
//		}
//		return null;
//			
//			
//		
//	}

}
