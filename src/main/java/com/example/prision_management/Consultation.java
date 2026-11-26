package com.example.prision_management;

import java.io.Serializable;
import java.time.LocalDate;

public class Consultation implements Serializable {

    private String prisonerId;
    private LocalDate consultationDate;
    private String details;


    public String getPrisonerId() {
        return prisonerId;
    }

    public void setPrisonerId(String prisonerId) {
        this.prisonerId = prisonerId;
    }

    public LocalDate getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(LocalDate consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Consultation(String prisonerId, LocalDate consultationDate, String details) {
        this.prisonerId = prisonerId;
        this.consultationDate = consultationDate;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "prisoneriD='" + prisonerId + '\'' +
                ", consultationDate=" + consultationDate +
                ", details='" + details + '\'' +
                '}';
    }
}
