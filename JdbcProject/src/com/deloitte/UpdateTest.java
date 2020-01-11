package com.deloitte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;
import java.util.Scanner;

public class UpdateTest {

	public static void main(String[] args) {

		String DRIVER = "", URL = "", USER = "", PASSWORD = "";
		String query = "update employee set age = ?, desig = ? where id = ?";
		Scanner scan = new Scanner(System.in);
		try {
//			props.load(new FileInputStream("db.config"));
//			Enumeration em = props.propertyNames();
//			String key = (String) em.nextElement();
			Map<String, String> dbConfigMap = new DBReader().getConfigMap();
			DRIVER = dbConfigMap.get("DRIVER");
			URL = dbConfigMap.get("URL");
			USER = dbConfigMap.get("USER");
			PASSWORD = dbConfigMap.get("PASSWORD");
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement stmt = conn.prepareStatement(query);
			System.out.println("Enter <id> <new-age> <new-desig>");
			stmt.setInt(3, scan.nextInt());
			stmt.setInt(1, scan.nextInt());
			stmt.setString(2, scan.next());

			int rows = stmt.executeUpdate();
			if (rows > 0) {
				System.out.println("Data updated in table");
			} else {
				System.out.println("Update Failed");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
