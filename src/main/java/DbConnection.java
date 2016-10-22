/**
 * Created by Gabriel Gutierrez on 10/22/2016.
 */
import com.microsoft.sqlserver.jdbc.*;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnection {
    Connection conn =null;
    CallableStatement cstmt = null;
    ResultSet rs = null;


    public void StartConnection(){


        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setIntegratedSecurity(true);
        ds.setServerName("COT-CIS3365-06");
        ds.setPortNumber(1433);
        ds.setDatabaseName("REMAX_BUSINESS_PROCESS");
        ds.setUser("COT-CIS3365-06/gegutier");
        ds.setPassword("&a%y8VPh9hA");
        try {
            conn=ds.getConnection();

        } catch (SQLServerException e) {
            e.printStackTrace();
            System.out.println("Exception: " + e);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

   /* public void CloseConnection() throws SQLException {
        conn.close();
    }*/

    /*public void ExecuteQuery(){
        try {

            cstmt.getConnection();
            cstmt.execute("SELECT * FROM MOCK");
            conn.commit();

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Exception: " + e);
        }
    }*/

}
