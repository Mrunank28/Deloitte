package com.deloitte;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Map;
import java.util.Scanner;

public class ProcedureTest {

	public static void main(String[] args) {
		String DRIVER = "", URL = "", USER = "", PASSWORD = "";
		String query = "call myproc(?, ?)";
		Scanner scan = new Scanner(System.in);
		try {
			Map<String, String> dbConfigMap = new DBReader().getConfigMap();
			DRIVER = dbConfigMap.get("DRIVER");
			URL = dbConfigMap.get("URL");
			USER = dbConfigMap.get("USER");
			PASSWORD = dbConfigMap.get("PASSWORD");
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			CallableStatement stmt = conn.prepareCall(query);
			System.out.println("Enter <Id>");
			int id = scan.nextInt();
			stmt.setInt(1, id);
			stmt.registerOutParameter(2, Types.INTEGER);
			stmt.executeUpdate();
			int allowance = stmt.getInt(2);
			System.out.println("Employee with Id " + id + " gets allowance of " + allowance);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
