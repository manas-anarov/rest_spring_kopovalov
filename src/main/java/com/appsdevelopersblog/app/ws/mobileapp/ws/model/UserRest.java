package com.appsdevelopersblog.app.ws.mobileapp.ws.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserRest {
    private Long id;
    String Email;
    String FirstName;
    String LastName;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public UserRest(String Email, String FirstName, String LastName){
        super();
        this.Email = Email;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public UserRest(){
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
