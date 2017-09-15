package com.nick.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by dreamcatchernick on 14/09/2017.
 */
public class User implements Serializable{

    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
