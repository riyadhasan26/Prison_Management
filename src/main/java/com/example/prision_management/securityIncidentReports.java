package com.example.prision_management;

public class securityIncidentReports {
    private string incident_type;
    private int incident_ID;
    private LocalDate incident_Date;

    public securityIncidentReports(string incident_type, int incident_ID, LocalDate incident_Date) {
        this.incident_type = incident_type;
        this.incident_ID = incident_ID;
        this.incident_Date = incident_Date;
    }

    public string getIncident_type() {
        return incident_type;
    }

    public void setIncident_type(string incident_type) {
        this.incident_type = incident_type;
    }

    public int getIncident_ID() {
        return incident_ID;
    }

    public void setIncident_ID(int incident_ID) {
        this.incident_ID = incident_ID;
    }

    public LocalDate getIncident_Date() {
        return incident_Date;
    }

    public void setIncident_Date(LocalDate incident_Date) {
        this.incident_Date = incident_Date;
    }

    @Override
    public String toString() {
        return "securityIncidentReports{" +
                "incident_type=" + incident_type +
                ", incident_ID=" + incident_ID +
                ", incident_Date=" + incident_Date +
                '}';
    }
}
