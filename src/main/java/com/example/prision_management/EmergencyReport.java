package com.example.prision_management;

public class EmergencyReport {

    private String prisonerId;
    private String symptoms;
    private String emergencyType;
    private String urgencyLevel;

    public String getPrisonerId() {
        return prisonerId;
    }

    public void setPrisonerId(String prisonerId) {
        this.prisonerId = prisonerId;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public EmergencyReport(String prisonerId, String symptoms, String emergencyType, String urgencyLevel) {
        this.prisonerId = prisonerId;
        this.symptoms = symptoms;
        this.emergencyType = emergencyType;
        this.urgencyLevel = urgencyLevel;
    }


    @Override
    public String toString() {
        return "EmergencyReport{" +
                "prisonerId='" + prisonerId + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", emergencyType='" + emergencyType + '\'' +
                ", urgencyLevel='" + urgencyLevel + '\'' +
                '}';
    }
}
