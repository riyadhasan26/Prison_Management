package com.example.prision_management.User;

public class RehabilitationOfficer {
    private Integer id;
    private String department;

    public RehabilitationOfficer(Integer id, String department) {
        this.id = id;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "RehabilitationOfficer{" +
                "id=" + id +
                ", department='" + department + '\'' +
                '}';
    }
}
