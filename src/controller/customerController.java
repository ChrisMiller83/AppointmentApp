package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class customerController implements Initializable {
    public Button addCustomerBtn;
    public Button modifyCustomerBtn;
    public Button deleteCustomerBtn;
    public TableColumn customerIdCol;
    public TableColumn customerNameCol;
    public TableColumn addressCol;
    public TableColumn zipCodeCol;
    public TableColumn countryCol;
    public TableColumn phoneNumCol;
    public TableColumn createdByCol;
    public TableColumn createdDateCol;
    public TableColumn updatedByCol;
    public TableColumn updatedDateCol;
    public Button mainMenuBtn;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void toAddCustomerPage(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/addCustomerView.fxml"));
        Stage stage = (Stage) ((Button)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void toModifyCustomerPage(ActionEvent actionEvent) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/view/updateCustomerView.fxml"));
        Stage stage = (Stage) ((Button)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void deleteCustomer(ActionEvent actionEvent) throws IOException {

    }

    public void toMainMenu(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/mainPageView.fxml"));
        Stage stage = (Stage) ((Button)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
