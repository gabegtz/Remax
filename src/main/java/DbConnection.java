/**
 * Created by Gabriel Gutierrez on 10/22/2016.
 */
import com.microsoft.sqlserver.jdbc.*;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
    Connection conn =null;
    CallableStatement cstmt = null;

    ResultSet rs = null;


    public Connection startConnection(){


        SQLServerDataSource ds = new SQLServerDataSource();
       // ds.setIntegratedSecurity(true);
       // ds.setServerName("COT-CIS3365-06");
       // ds.setPortNumber(1433);
       //ds.setDatabaseName("REMAX_BUSINESS_PROCESS");
       ds.setUser("application");
       ds.setPassword("Gabodel8*");
        try {
            conn=ds.getConnection();

      

        } catch (SQLServerException e) {
            e.printStackTrace();
            System.out.println("Exception: " + e);
        } 
        System.out.println("Connected");
        return conn;


    }

   public void CloseConnection() throws SQLException {
        conn.close();
        if(conn.isClosed()){
        	System.out.println("Connection closed");
        }
        else{System.out.println("Connection is still open, dingus");}
    }

    public void executeQuery(String statement){
    	
    	try {
			Statement stmt = startConnection().createStatement();
			stmt.executeQuery(statement);
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
        
    }
    
   

}
