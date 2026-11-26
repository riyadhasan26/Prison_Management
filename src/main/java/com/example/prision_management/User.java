package com.example.prision_management;

import java.io.Serializable;

public abstract class User implements Authenticatable, Serializable {

    protected  String userID;
    protected  String password;
    protected  String name;
    protected  String contact;


    public boolean login(String enteredId, String enteredPassword) {
        if (userID.equals(enteredId) && password.equals(enteredPassword)) {
            return true;
        } else {
            return false;
        }
    }

    public void logout() {
        System.out.println(name + " logged out");
    }


    public String getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public User(String userID, String password, String name, String contact) {
        this.userID = userID;
        this.password = password;
        this.name = name;
        this.contact = contact;
    }
}
