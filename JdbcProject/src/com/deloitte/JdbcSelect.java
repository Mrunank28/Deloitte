package com.deloitte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Properties;

public class JdbcSelect {

	public static void main(String[] args) {
//		String driver = "oracle.jdbc.driver.OracleDriver";
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "deloitte";
//		String password = "123";
	String query = "select id,name,age,desig,doj,dept from employee";
	Connection conn = null;
		Properties props = new Properties();
		String DRIVER = "", URL = "", USER = "", PASSWORD = "";
		try {
			props.load(new FileInputStream("db.config"));
			Enumeration em = props.propertyNames();
			String key = (String) em.nextElement();
			DRIVER = props.getProperty("DRIVER");
			URL = props.getProperty("URL");
			USER = props.getProperty("USER");
			PASSWORD = props.getProperty("PASSWORD");
			
			Class.forName(DRIVER);
			System.out.println("Driver loaded");
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Connection Established");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + ", " + rs.getString(2)
				+ ", " + rs.getInt(3) + ", " + rs.getString(4) + 
				", " +rs.getDate(5) + ", " +rs.getInt(6));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
	}

}
