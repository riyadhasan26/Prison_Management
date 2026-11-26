package com.example.prision_management;

import java.io.Serializable;

public abstract class Staff extends User implements Serializable {

    protected String staffID;
    protected String position;
    protected String department;
    protected String assignedDuty;


    public String getStaffID() {
        return staffID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAssignedDuty() {
        return assignedDuty;
    }

    public void setAssignedDuty(String assignedDuty) {
        this.assignedDuty = assignedDuty;
    }


    public Staff(String userID, String password, String name, String contact, String staffID, String position, String department, String assignedDuty) {
        super(userID, password, name, contact);
        this.staffID = staffID;
        this.position = position;
        this.department = department;
        this.assignedDuty = assignedDuty;
    }
}
