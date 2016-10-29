package entities;

import controllers.DbConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * Created by Gabriel Gutierrez on 10/29/2016.
 */
public class Property {
    String h_number;
    String street;
    int value;
    int sq_foot;
    private DbConnection connection = new DbConnection();

    public Property(String h_number, String street, int value, int sq_foot ){
        this.h_number=h_number;
        this.street=street;
        this.value=value;
        this.sq_foot=sq_foot;

    }

    public void addToDatabase(String prepared_statement) throws SQLException {

        String newUser = "INSERT INTO PROPERTY([column names (4)]) VALUES(?, ?, ?, ?)";
        PreparedStatement pstmt = connection.startConnection().prepareStatement(newUser);
        pstmt.setString(1, h_number);
        pstmt.setString(2, street);
        pstmt.setInt(3, value);
        pstmt.setInt(4, sq_foot);
        pstmt.execute();
        pstmt.close();
        connection.CloseConnection();




    }
}
