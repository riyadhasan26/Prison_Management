package com.example.prision_management;

import java.time.LocalDate;
import java.util.ArrayList;

public class MedicalStaff extends Staff {

    private ArrayList<TreatmentRecord> treatmentList = new ArrayList<>();
    private ArrayList<Appointment> appointmentList = new ArrayList<>();
    private ArrayList<Medication> medicationList = new ArrayList<>();
    private ArrayList<MedicalSupply> supplyList = new ArrayList<>();
    private ArrayList<EmergencyReport> emergencyList = new ArrayList<>();

    public void recordTreatment(TreatmentRecord t){
        treatmentList.add(t);
    }




    public boolean updateMedicalRecords(String prisonerId, LocalDate treatmentDate, String newDiagnosis, String newTreatment) {
        for (TreatmentRecord t : treatmentList) {
            if (t.getPrisonerId().equals(prisonerId) && t.getTreatmentDate().equals(treatmentDate)) {
                t.setDiagnosis(newDiagnosis);
                t.setTreatmentProvided(newTreatment);
                return true;
            }
        }
        return false;
    }


    public void scheduleAppointment(Appointment a) {
        appointmentList.add(a);
    }

    public void recordMedication(Medication m) {
        medicationList.add(m);
    }

    public void trackSupplies(MedicalSupply s) {
        supplyList.add(s);
    }

    public void reportEmergency(EmergencyReport e) {
        emergencyList.add(e);
    }
    public ArrayList<TreatmentRecord> viewMedicalHistory(String prisonerId) {
        ArrayList<TreatmentRecord> history = new ArrayList<>();
        for (TreatmentRecord t : treatmentList) {
            if (t.getPrisonerId().equals(prisonerId)) {
                history.add(t);
            }
        }
        return history;
    }

    public String generateMedicalReport(String prisonerId) {
        int count = 0;
        for (TreatmentRecord t : treatmentList) {
            if (t.getPrisonerId().equals(prisonerId)) {
                count++;
            }
        }
        return "Prisoner " + prisonerId + " has " + count + " treatment(s)";
    }





    public ArrayList<TreatmentRecord> getTreatmentList() {
        return treatmentList;
    }

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public ArrayList<Medication> getMedicationList() {
        return medicationList;
    }

    public ArrayList<MedicalSupply> getSupplyList() {
        return supplyList;
    }

    public ArrayList<EmergencyReport> getEmergencyList() {
        return emergencyList;
    }

    public MedicalStaff(String userID, String password, String name, String contact, String staffID, String position, String department, String assignedDuty) {
        super(userID, password, name, contact, staffID, position, department, assignedDuty);
    }













































}
