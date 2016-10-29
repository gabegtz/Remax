package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserVerification {
	String sql = null;

	DbConnection dbHelp = new DbConnection();
	Connection conn = dbHelp.startConnection();

	public UserVerification(String username, String password) throws SQLException {
		sql = "SELECT * FROM dbo.ACCOUNT WHERE USERNAME = '" + username + "' AND PASSWORD = '" + password+"';";
		System.out.println(sql);
		Statement stmt = conn.createStatement();
		ResultSet userResult = stmt.executeQuery(sql);
		while(userResult.next()){
			System.out.println(userResult.getString("USERNAME"));
		}

		try {
			dbHelp.CloseConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
