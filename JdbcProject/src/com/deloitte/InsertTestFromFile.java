package com.deloitte;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;

public class InsertTestFromFile {

	public static void main(String[] args) {

		Properties props = new Properties();
		String DRIVER = "", URL = "", USER = "", PASSWORD = "";
		String query = "insert into employee(id,name,age,desig,doj,dept) values (?,?,?,?,?,?)";
		Scanner scan = new Scanner(System.in);
		
		FileReader fr = null;
		BufferedReader br = null;
		String line = "";
		
		int rows= 0;
		
		try {
			props.load(new FileInputStream("db.config"));
			Enumeration em = props.propertyNames();
			String key = (String) em.nextElement();
			DRIVER = props.getProperty("DRIVER");
			URL = props.getProperty("URL");
			USER = props.getProperty("USER");
			PASSWORD = props.getProperty("PASSWORD");
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement stmt = conn.prepareStatement(query);
			
			fr = new FileReader("database.txt");
			br = new BufferedReader(fr);
			while((line = br.readLine()) != null) {
				String[] strArr = line.split(",");
				stmt.setInt(1, Integer.parseInt(strArr[0]));
				stmt.setString(2, strArr[1]);
				stmt.setInt(3, Integer.parseInt(strArr[2]));
				stmt.setString(4, strArr[3]);
				stmt.setString(5, strArr[4]);
				stmt.setInt(6, Integer.parseInt(strArr[5]));
				rows = stmt.executeUpdate();
				}
			
			
			if(rows > 0) {
				System.out.println("Data inserted into table");
			}
			else {
				System.out.println("Insert Failed");
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
