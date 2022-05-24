package controller;

import javafx.scene.control.Alert;

public class alertMessage {
    public static void addSuccessful() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Successful");
        alert.setContentText("Appointment was successfully added!");
        alert.showAndWait();
    }

    public static void unSuccessful() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Unsuccessful");
        alert.setContentText("Appointment was not added!");
        alert.showAndWait();
    }
}
