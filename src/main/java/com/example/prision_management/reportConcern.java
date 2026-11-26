package com.example.prision_management;

public class reportConcern {
    private int Concern_ID;
    private string Concern_Type;

    public reportConcern(int concern_ID, string concern_Type) {
        Concern_ID = concern_ID;
        Concern_Type = concern_Type;
    }

    public int getConcern_ID() {
        return Concern_ID;
    }

    public void setConcern_ID(int concern_ID) {
        Concern_ID = concern_ID;
    }

    public string getConcern_Type() {
        return Concern_Type;
    }

    public void setConcern_Type(string concern_Type) {
        Concern_Type = concern_Type;
    }

    @Override
    public String toString() {
        return "reportConcern{" +
                "Concern_ID=" + Concern_ID +
                ", Concern_Type=" + Concern_Type +
                '}';
    }
}
