package com.example.prision_management;

public class staffInformation {
    private int staffmember;
    private int id;

    public staffInformation(int staffmember, int id) {
        this.staffmember = staffmember;
        this.id = id;
    }

    public int getStaffmember() {
        return staffmember;
    }

    public void setStaffmember(int staffmember) {
        this.staffmember = staffmember;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "staffInformation{" +
                "staffmember=" + staffmember +
                ", id=" + id +
                '}';
    }
}
