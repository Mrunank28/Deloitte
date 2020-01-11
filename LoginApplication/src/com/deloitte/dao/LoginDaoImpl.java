package com.deloitte.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.deloitte.bean.User;
import com.deloitte.util.DBUtil;

public class LoginDaoImpl implements LoginDao {

	@Override
	public String getUserType(User user) {
		Connection conn = DBUtil.getConnection();
		String query = "select password, type from User_details where login =?";
		PreparedStatement stmt;
		try {
			stmt = conn.prepareStatement(query);
			stmt.setString(1, user.getLogin());
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				String password = rs.getString(1);
				String type = rs.getString(2);
				if (password.equals(user.getPassword())) {
					return type;
				}
			} else {
				System.out.println("else loop");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void closeConnection() {
		DBUtil.closeConnection();
		
	}

}
