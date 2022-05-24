package model;

import DAO.UserDaoImpl;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Appointment model class
 */
public class Appointment {
    private int appointmentId;
    private String title;
    private String description;
    private String location;
    private String type;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private LocalDateTime createdDate;
    private String createdBy;
    private Timestamp lastUpdated;
    private String lastUpdatedBy;
    private int customerId;
    private int userId;
    private int contactId;
    private Contact contact;
    private User user;

    /**
     * Appointment constructor
     * @param appointmentId the appointment's id number
     * @param title title of the appointment
     * @param description  description of what the appointment is for
     * @param location  location of the appointment
     * @param type  type of appointment
     * @param startDateTime start time and date of the appointment
     * @param endDateTime  end time and date of the appointment
     * @param createdDate  day the appointment was made
     * @param createdBy  who created the appointment
     * @param lastUpdated  if and when the appointment was changed
     * @param lastUpdatedBy  who changed the appointment
     * @param customerId  customer id the appointment is with
     * @param userId  user id
     * @param contactId  contact id
     */
    public Appointment(int appointmentId, String title, String description, String location, String type, LocalDateTime startDateTime, LocalDateTime endDateTime, LocalDateTime createdDate, String createdBy, Timestamp lastUpdated, String lastUpdatedBy, int customerId, int userId, int contactId) {
        this.appointmentId = appointmentId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = type;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.lastUpdated = lastUpdated;
        this.lastUpdatedBy = lastUpdatedBy;
        this.customerId = customerId;
        this.userId = userId;
        this. contactId = contactId;
    }

    /**
     * @param appointmentId sets the appointment id
     */
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    /**
     * @return returns the appointmentId
     */
    public int getAppointmentId() {
        return appointmentId;
    }

    /**
     * setTitle
     * @param title sets the appointments title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * getTitle
     * @return returns the appointments title
     */
    public String getTitle() {
        return title;
    }

    /**
     * setDescription
     * @param description sets the description of the appointment
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * getDescription
     * @return returns a description of the appointment
     */
    public String getDescription() {
        return description;
    }

    /**
     * setLocation
     * @param location sets the appointment location.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * getLocation
     * @return returns the appointment location.
     */
    public String getLocation() {
        return  location;
    }

    /**
     * setType
     * @param type sets the type of appointment
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * getType
     * @return returns type of appointment.
     */
    public String getType() {
        return type;
    }

    /**
     * setStartDateTime
     * @param startDateTime sets the date and time the appointment starts
     */
    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * getStartDateTime
     * @return returns the date and time the appointment starts
     */
    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    /**
     * setEndDateTime
     * @param endDateTime sets the date and time the appointment ends
     */
    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * getEndDateTime
     * @return returns the date and time the appointment ends
     */
    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    /**
     * setCreatedDate
     * @param createdDate sets the date and time the appointment was created
     */
    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * getCreatedDate
     * @return returns the date and time the appointment was created
     */
    public LocalDateTime getCreatedDate(){
        return createdDate;
    }

    /**
     * setCreatedBy
     * @param createdBy sets the name of the user who created the appointment.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * getCreatedBy
     * @return returns the user's name who created the appointment
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * setLastUpdated
     * @param lastUpdated sets the time the appointment was last updated.
     */
    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * getLastUpdated
     * @return returns the time the appointment was last updated
     */
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }

    /**
     * setLastUpdatedBy
     * @param lastUpdatedBy set the user who last updated the appointment
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * getLastUpdatedBy
     * @return returns the user's name who last updated the appointment
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * setCustomerId
     * @param customerId sets the customerId
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * getCustomerId
     * @return returns the customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * setUserId
     * @param userId sets the userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * getUserId
     * @return returns the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * setContactId
     * @param contactId sets the contactId
     */
    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    /**
     * getContactId gets the contactId
     * @return returns the contactId
     */
    public int getContactId() {
        return contactId;
    }

    /**
     * getContact gets the contact from the Contact model associated with the appointment.
     * @return returns the contact
     * @throws SQLException throws SQL error if found and continues.
     */
    public Contact getContact() throws SQLException {
        ContactDaoImp contactDao = new ContactDaoImpl();
        this.contact = contactDao.getContact(getContactId());
        return this.contact;
    }

    /**
     * getContactName gets the contact name from the Contact model associated with the appointment.
     * @return returns the contact's name.
     * @throws SQLException throws SQL error if found and continues.
     */
    public String getContactName() throws SQLException {
        Contact contact = getContact();
        String name = contact.getContactName();
        return name;
    }

    /**
     * getUser gets the user from the User model associated with the appointment.
     * @return returns the User
     * @throws SQLException throws SQL error if found and continues.
     */
    public User getUser() throws SQLException {
        UserDaoImpl userDao = new UserDaoImpl();
        this.user = userDao.getUser(getUserId());
        return this.user;
    }
}