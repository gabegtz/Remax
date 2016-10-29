/**
 * Created by Gabriel Gutierrez on 10/22/2016.
 */
import com.microsoft.sqlserver.jdbc.*;

import java.sql.*;

public class DbConnection{
    Connection conn =null;
    CallableStatement cstmt = null;

    ResultSet rs = null;


    public Connection startConnection(){
        // Instantiating new datasource.
        SQLServerDataSource ds = new SQLServerDataSource();
        // Setting username and password
        ds.setUser("application");
        ds.setPassword("Gabodel8*");
        // Verifying connection.
        try {
            conn=ds.getConnection();
        } catch (SQLServerException e) {
            e.printStackTrace();
            System.out.println("Exception: " + e);
        }

        // What is logger?
        System.out.println("Connected");
        return conn;
    }

    //Method used to close connecitons to avoid open connections;
    public void CloseConnection() throws SQLException {
        //Connection closing
        conn.close();
        // Verifying connection is closed;
        if(conn.isClosed()){
            System.out.println("Connection closed");
        }
        else{System.out.println("Connection is still open, dingus");}
    }



  /*

  Method used for testing purposes only.

  public void executeQuery(PreparedStatement statement) throws SQLException {
        PreparedStatement stmt = startConnection().prepareStatement(statement);
        stmt.setString();
        stmt.execute();
        results = stmt.executeQuery(statement);
        while (results.next()){
            System.out.println(results.getString(3));

        }
        stmt.close();


        return results;

    }*/





}
