package controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;


/**
 * Created by Gabriel Gutierrez on 10/4/2016.
 */
public class HelloWorld  extends Application {
    public static void main(String[] args) throws SQLException {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main_screen.fxml"));
        primaryStage.setTitle("DB Display");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void runTests() throws SQLException {
        Date today = new Date(Calendar.getInstance().getTimeInMillis());
        //Account newAccount = new Account("gegutier", "123", today);
        UserVerification uVer = new UserVerification("gegutier","123");

        //connection.StartConnection();
        //        connection.CloseConnection();


        //I've made a change.

    }
}
