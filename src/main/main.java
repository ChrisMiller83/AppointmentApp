package main;

import DAO.DBConnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.SQLException;

public class main extends Application {
    public static Connection conn;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/view/loginView.fxml"));
        stage.setTitle("Appointment Scheduler");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) throws SQLException {
        conn = DBConnection.startConnection();
        launch(args);
    }
}
