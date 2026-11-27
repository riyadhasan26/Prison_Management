package com.example.prision_management;

public class recordActivityParticipation {
    private int Participation_ID;
    private string Activity_Name;

    public recordActivityParticipation(int participation_ID, string activity_Name) {
        Participation_ID = participation_ID;
        Activity_Name = activity_Name;
    }

    public int getParticipation_ID() {
        return Participation_ID;
    }

    public void setParticipation_ID(int participation_ID) {
        Participation_ID = participation_ID;
    }

    public string getActivity_Name() {
        return Activity_Name;
    }

    public void setActivity_Name(string activity_Name) {
        Activity_Name = activity_Name;
    }

    @Override
    public String toString() {
        return "recordActivityParticipation{" +
                "Participation_ID=" + Participation_ID +
                ", Activity_Name=" + Activity_Name +
                '}';
    }
}
