package com.example.prision_management;

import java.time.LocalDate;

public class TreatmentRecord {




    private String prisonerId;
    private String diagnosis;
    private String treatmentProvided;
    private LocalDate treatmentDate;







    public String getPrisonerId() {
        return prisonerId;
    }

    public void setPrisonerId(String prisonerId) {
        this.prisonerId = prisonerId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatmentProvided() {
        return treatmentProvided;
    }

    public void setTreatmentProvided(String treatmentProvided) {
        this.treatmentProvided = treatmentProvided;
    }

    public LocalDate getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(LocalDate treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public TreatmentRecord(String prisonerId, String diagnosis, String treatmentProvided, LocalDate treatmentDate) {

        this.prisonerId = prisonerId;
        this.diagnosis = diagnosis;
        this.treatmentProvided = treatmentProvided;
        this.treatmentDate = treatmentDate;
    }

    @Override
    public String toString() {
        return "TreatmentRecord{" +
                "prisonerId='" + prisonerId + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", treatmentProvided='" + treatmentProvided + '\'' +
                ", treatmentDate=" + treatmentDate +
                '}';
    }
}
