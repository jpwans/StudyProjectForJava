package com.wrox;

import java.time.Instant;
import java.time.MonthDay;
import java.util.Date;

/**
 * Created by jiangqin on 17/3/27.
 */
public class Contact implements Comparable<Contact> {

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public MonthDay getBirthday() {
        return birthday;
    }

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthday(MonthDay birthday) {
        this.birthday = birthday;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private MonthDay birthday;
    private Instant dateCreated;

    public Contact(){}

    public Contact(String firstName, String lastName, String phoneNumber, String address, MonthDay birthday, Instant dateCreated){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.birthday = birthday;
        this.dateCreated = dateCreated;
    }

    @Override
    public int compareTo(Contact o) {
        int last = lastName.compareTo(o.lastName);
        if (last == 0)
            return firstName.compareTo(o.firstName);
        return last;
    }

    public Date getOldDateCreated(){
        return new Date(this.dateCreated.toEpochMilli());
    }
}
