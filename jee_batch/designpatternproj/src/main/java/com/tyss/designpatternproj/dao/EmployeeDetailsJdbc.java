package com.tyss.designpatternproj.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.tyss.designpatternproj.dto.Primary_Info;

public class EmployeeDetailsJdbc implements EmployeeDetailsDAO {

	@Override
	public Primary_Info getSingleRecord(int eid) {

		Connection connection = null;
		PreparedStatement pstatement = null;
		ResultSet resultSet = null;
		Primary_Info info = new Primary_Info();
		try {

			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/ems", "root", "root");
			String query = " select * from primary_info where id = ? ";
			pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, eid);
			resultSet = pstatement.executeQuery();

			while (resultSet.next()) {
				info.setId(resultSet.getInt("id"));
				info.setName(resultSet.getString("name"));
				info.setDob(resultSet.getDate("dob"));
				info.setPhoneno(resultSet.getLong("phoneno"));
				return info;
			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (pstatement != null) {
					pstatement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		return info;
	}
		
		
	@Override
	public List<Primary_Info> getAllRecords() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		Primary_Info info = null;
		List<Primary_Info> infos = new ArrayList<Primary_Info>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/ems", "root", "root");
			String query = " select * from primary_info ";
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				info = new Primary_Info();
				info.setId(resultSet.getInt("id"));
				info.setName(resultSet.getString("name"));
				info.setDob(resultSet.getDate("dob"));
				info.setPhoneno(resultSet.getLong("phoneno"));
				infos.add(info);
			}
			return infos;
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		return infos;

	
	}

		
	@Override
	public void insertRecord(Primary_Info info) {

		Connection connection = null;
		PreparedStatement pstatement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/ems", "root", "root");
			String query = " insert into  primary_info values(?,?,?,?) ";
			pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, info.getId());
			pstatement.setString(2, info.getName());
			pstatement.setDate(3, (Date) info.getDob());
			pstatement.setLong(4, info.getPhoneno());
			pstatement.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (pstatement != null) {
					pstatement.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

	@Override
	public void deleteRecord(int eid) {

		Connection connection = null;
		PreparedStatement pstatement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/ems", "root", "root");
			String query = " delete from primary_info where id= ? ";
			pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, eid);
			pstatement.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (pstatement != null) {
					pstatement.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}

	@Override
	public void updateRecord(int eid) {
		Scanner scanner = new Scanner(System.in);
		Connection connection = null;
		PreparedStatement pstatement = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/ems", "root", "root");
			String query = " update primary_info set name=? where id= ? ";
			pstatement = connection.prepareStatement(query);
			System.out.println("enter name which you want to update");
			String name = scanner.nextLine();
			pstatement.setString(1, name);
			pstatement.setInt(2, eid);
			pstatement.executeUpdate();
		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (pstatement != null) {
					pstatement.close();
				}

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
		scanner.close();

	}


}
