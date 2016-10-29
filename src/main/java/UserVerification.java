import java.sql.Connection;
import java.sql.SQLException;

public class UserVerification {
	String sql = null;
	
	DbConnection connection = new DbConnection();
	
	public UserVerification(String username, String password){
	sql = "SELECT 1 FROM test_users WHERE username = '" + username + "' AND password = '" + password+"';";
	System.out.println(sql);
	
	connection.executeQuery(sql);
	try {
		connection.CloseConnection();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
