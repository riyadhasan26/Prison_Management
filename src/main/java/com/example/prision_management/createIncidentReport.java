package com.example.prision_management;

public class createIncidentReport {
    private int Incident_ID;
    private LocalDate Incident_Date;

    public createIncidentReport(int incident_ID, LocalDate incident_Date) {
        Incident_ID = incident_ID;
        Incident_Date = incident_Date;
    }

    public int getIncident_ID() {
        return Incident_ID;
    }

    public void setIncident_ID(int incident_ID) {
        Incident_ID = incident_ID;
    }

    public LocalDate getIncident_Date() {
        return Incident_Date;
    }

    public void setIncident_Date(LocalDate incident_Date) {
        Incident_Date = incident_Date;
    }

    @Override
    public String toString() {
        return "createIncidentReport{" +
                "Incident_ID=" + Incident_ID +
                ", Incident_Date=" + Incident_Date +
                '}';
    }
}
