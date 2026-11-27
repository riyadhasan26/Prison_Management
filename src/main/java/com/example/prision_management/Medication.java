package com.example.prision_management;

import java.io.Serializable;

public class Medication implements Serializable {

    private String medicationName;
    private String dosage;
    private int quantity;
    private String prisonerId;

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPrisonerId() {
        return prisonerId;
    }

    public void setPrisonerId(String prisonerId) {
        this.prisonerId = prisonerId;
    }

    public Medication(String medicationName, String dosage, int quantity, String prisonerId) {
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.quantity = quantity;
        this.prisonerId = prisonerId;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "medicationName='" + medicationName + '\'' +
                ", dosage='" + dosage + '\'' +
                ", quantity=" + quantity +
                ", prisonerId='" + prisonerId + '\'' +
                '}';
    }
}
