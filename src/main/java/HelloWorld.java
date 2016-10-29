import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.Calendar;


/**
 * Created by Gabriel Gutierrez on 10/4/2016.
 */
public class HelloWorld {// extends Application {
    public static void main(String[] args) throws SQLException {
        //launch(args);
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY,0);
        Account newAccount = new Account("gegutier", "123", today.toString());
        //connection.StartConnection();
//        connection.CloseConnection();


        //I've made a change.
    }

   // @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
