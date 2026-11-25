package com.example.prision_management;

import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {

    private String prisonerId;
    private LocalDate appointmentDate;
    private String appointmentTime;
    private String staffId;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getPrisonerId() {
        return prisonerId;
    }

    public void setPrisonerId(String prisonerId) {
        this.prisonerId = prisonerId;
    }

    public Appointment(String prisonerId, LocalDate appointmentDate, String appointmentTime, String staffId) {
        this.prisonerId = prisonerId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "prisonerId='" + prisonerId + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", appointmentTime=" + appointmentTime +
                ", staffId='" + staffId + '\'' +
                '}';
    }
}
