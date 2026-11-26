package com.example.prision_management;

public class recordEmergencyIncident {
    private int Emergency_ID;
    private string Emergency_Type;
    private LocalDate Emergency_Date;

    public recordEmergencyIncident(int emergency_ID, string emergency_Type, LocalDate emergency_Date) {
        Emergency_ID = emergency_ID;
        Emergency_Type = emergency_Type;
        Emergency_Date = emergency_Date;
    }

    public int getEmergency_ID() {
        return Emergency_ID;
    }

    public void setEmergency_ID(int emergency_ID) {
        Emergency_ID = emergency_ID;
    }

    public string getEmergency_Type() {
        return Emergency_Type;
    }

    public void setEmergency_Type(string emergency_Type) {
        Emergency_Type = emergency_Type;
    }

    public LocalDate getEmergency_Date() {
        return Emergency_Date;
    }

    public void setEmergency_Date(LocalDate emergency_Date) {
        Emergency_Date = emergency_Date;
    }

    @Override
    public String toString() {
        return "recordEmergencyIncident{" +
                "Emergency_ID=" + Emergency_ID +
                ", Emergency_Type=" + Emergency_Type +
                ", Emergency_Date=" + Emergency_Date +
                '}';
    }
}
