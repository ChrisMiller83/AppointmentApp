package controller;

import Utilities.ChangeView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Customer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class addCustomerController implements Initializable {
    private FirstLevelDivisionDAOImpl firstLevelDivisionDAO = new FirstLevelDivisionDAOImpl();
    private CountryDAOImpl countryDAO = new CountryDAOImpl();
    private CustomerDAOImpl customerDAO = new CustomerDAOImpl();
    private FilterDivisions filterDivisions = new FilterDivisions();

    private String name;
    private String phone;
    private String address;
    private String city;
    private String zip;
    private String state;
    private String fullAddress;
    private Country selectedCountry;
    private FirstLevelDivision selectedDivision;

    @FXML private ObservableList<FirstLevelDivision> firstLevelDivisions = firstLevelDivisionDAO.getAllDivisions();

    @FXML private ObservableList<FirstLevelDivison> filteredDivisions = FXCollections.observableArrayList();

    @FXML private ObservableList<Country> countries = countryDAO.getAllCountries();

    @FXML private TextField customerIdTF;
    @FXML private TextField customerNameTF;
    @FXML private TextField phoneNumTF;
    @FXML private TextField addressTF;
    @FXML private TextField cityTF;
    @FXML private TextField zipCodeTF;
    @FXML private TextField stateTF;
    @FXML private ComboBox<Country> countryComboBox;
    @FXML private ComboBox<FirstLevelDivision> stateProvinceComboBox;
    @FXML private Button cancelBtn;
    @FXML private Button saveBtn;


    @FXML void cancelToCustomer(ActionEvent event) throws IOException {
        ChangeView.changeView(event, "customersView.fxml");
    }

    public void saveCustomer(ActionEvent event) throws IOException {
        try {
            uniqueCustomerId = Customer.getUniqueCustomerId.getAndIncrement();
            String name = customerNameTF.getText();
            String phone = phoneNumTF.getText();
            String address = addressTF.getText();
            String city = cityTF.getText();
            String zip = zipCodeTF.getText();
            String state = stateTF.getText().toUpperCase();
            selectedCountry = countryComboBox.getSelectionModel().getSelectedItem();
            selectedDivision = stateProvinceComboBox.getSelectionModel().getSelectedItem();

            if (name.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() || zip.isEmpty() || state.isEmpty() || selectedCountry == null || selectedDivision == null) {
                errorMessage.emptyField();
                return;
            }

            if (zip.length() > 5) {
                errorMessage.errorWindow(2);
                return;

            }
            ChangeView.changeView(event, "customersView.fxml");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        countryComboBox.setPromptText("Select a country");
        countryComboBox.setItems(countries);
        stateProvinceComboBox.setPromptText("Select a country first");
        stateProvinceComboBox.setItems(null);
    }


}
