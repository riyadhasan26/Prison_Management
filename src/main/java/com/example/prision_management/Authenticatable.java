package com.example.prision_management;

public interface Authenticatable {

    boolean login (String enteredId, String enteredPassword);
    void logout();
}
