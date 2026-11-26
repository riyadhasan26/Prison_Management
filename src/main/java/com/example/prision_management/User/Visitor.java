package com.example.prision_management.User;

public class Visitor {
    private String visitorName;
    private String phoneNumber;

    public Visitor(String visitorName, String phoneNumber) {
        visitorName = visitorName;
        phoneNumber = phoneNumber;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        visitorName = visitorName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "VisitorName='" + visitorName + '\'' +
                ", PhoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
