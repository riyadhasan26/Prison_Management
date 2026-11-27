package com.example.prision_management;

public class prisoner {
    private int Prisoner_ID;
    private string Full_Name;

    public prisoner(int prisoner_ID, string full_Name) {
        Prisoner_ID = prisoner_ID;
        Full_Name = full_Name;
    }

    public int getPrisoner_ID() {
        return Prisoner_ID;
    }

    public void setPrisoner_ID(int prisoner_ID) {
        Prisoner_ID = prisoner_ID;
    }

    public string getFull_Name() {
        return Full_Name;
    }

    public void setFull_Name(string full_Name) {
        Full_Name = full_Name;
    }

    @Override
    public String toString() {
        return "prisoner{" +
                "Prisoner_ID=" + Prisoner_ID +
                ", Full_Name=" + Full_Name +
                '}';
    }
}
