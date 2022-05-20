package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDateTime;

public class Customer {
    private int customerId;
    private String customerName;
    private String address;
    private String phoneNumber;
    private String zipCode;
    private LocalDateTime createdDateTime;
    private String createdBy;
    private LocalDateTime lastUpdated;
    private String lastUpdatedBy;
    private int divisionID;


    public Customer() {
    }

    public Customer(int customerId, String customerName, String address, String phoneNumber, String zipCode, LocalDateTime createdDateTime, String createdBy, LocalDateTime lastUpdated, String lastUpdatedBy, int divisionID) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.createdDateTime = createdDateTime;
        this.createdBy = createdBy;
        this.lastUpdated = lastUpdated;
        this.lastUpdatedBy = lastUpdatedBy;
        this.divisionID = divisionID;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setCreatedDateTime(LocalDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }

    public String getFormattedCreatedDate() {
        return TimeConversion.formatDate(getCreatedDateTime());
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getFormattedLastUpdated() {
        return TimeConversion.formateDate(getLastUpdated());
    }

    public LocalDateTime getLastUpdated() {
        return  lastUpdated;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setDivisionID(int divisionID) {
        this.divisionID = divisionID;
    }

    public int getDivisionID() {
        return divisionID;
    }

    @Override
    public String toString() {
        return customerId + ": " + customerName;
    }
}
