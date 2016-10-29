import java.sql.ResultSet;
import java.sql.SQLException;

public class UserVerification {
	String sql = null;

	DbConnection connection = new DbConnection();

	public UserVerification(String username, String password) throws SQLException {
		sql = "SELECT 1 FROM test_users WHERE username = '" + username + "' AND password = '" + password+"';";
		//sql = "INSERT INTO test_users(username, password) VALUES ('Potato', 'Mr.');";
		System.out.println(sql);
		//connection.executeQuery(sql);
		ResultSet userResult = connection.executeQuery(sql);

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
