import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Gabriel Gutierrez on 10/29/2016.
 */
public class Account {
    private String username;
    private String password;
    private String c_date;

    private DbConnection connection = new DbConnection();

    public Account(String username, String password, String c_date) throws SQLException {
        username=this.username;
        password=this.password;
        c_date=this.c_date;
        addToDatabase();
    }

    private void addToDatabase() throws SQLException {

        String newUser = "INSERT INTO ACCOUNT(USERNAME, PASSWORD, ROLE, CREATE_DATE)"+ "VALUES(?, ?, ?)";
        PreparedStatement pstmt = connection.startConnection().prepareStatement(newUser);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        pstmt.setString(3, c_date);
        pstmt.execute();
        pstmt.close();




    }
}

