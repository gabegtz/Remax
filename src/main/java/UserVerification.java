import java.sql.ResultSet;
import java.sql.SQLException;

public class UserVerification {
	String sql = null;

	DbConnection connection = new DbConnection();

	public UserVerification(String username, String password) throws SQLException {
		sql = "SELECT 1 FROM 'dbo.ACCOUNT' WHERE USERNAME = '" + username + "' AND PASSWORD = '" + password+"';";
		System.out.println(sql);
		//connection.executeQuery(sql);
		ResultSet userResult = connection.obtainResults(sql);

		while (userResult.next()) {
			System.out.println(userResult.getString("username"));

		}
		try {
			connection.CloseConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
