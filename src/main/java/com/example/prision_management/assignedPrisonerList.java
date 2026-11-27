package com.example.prision_management;

public class assignedPrisonerList {
    private int Prisoner_ID;
    private string Prisoner_Name;

    public assignedPrisonerList(int prisoner_ID, string prisoner_Name) {
        Prisoner_ID = prisoner_ID;
        Prisoner_Name = prisoner_Name;
    }

    public int getPrisoner_ID() {
        return Prisoner_ID;
    }

    public void setPrisoner_ID(int prisoner_ID) {
        Prisoner_ID = prisoner_ID;
    }

    public string getPrisoner_Name() {
        return Prisoner_Name;
    }

    public void setPrisoner_Name(string prisoner_Name) {
        Prisoner_Name = prisoner_Name;
    }

    @Override
    public String toString() {
        return "assignedPrisonerList{" +
                "Prisoner_ID=" + Prisoner_ID +
                ", Prisoner_Name=" + Prisoner_Name +
                '}';
    }
}
