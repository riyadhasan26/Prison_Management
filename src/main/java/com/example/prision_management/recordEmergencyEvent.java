package com.example.prision_management;

public class recordEmergencyEvent {
    private int Emergency_Event_ID;
    private LocalDate Event_Date;


    public recordEmergencyEvent(int emergency_Event_ID, LocalDate event_Date) {
        Emergency_Event_ID = emergency_Event_ID;
        Event_Date = event_Date;
    }

    public int getEmergency_Event_ID() {
        return Emergency_Event_ID;
    }

    public void setEmergency_Event_ID(int emergency_Event_ID) {
        Emergency_Event_ID = emergency_Event_ID;
    }

    public LocalDate getEvent_Date() {
        return Event_Date;
    }

    public void setEvent_Date(LocalDate event_Date) {
        Event_Date = event_Date;
    }

    @Override
    public String toString() {
        return "recordEmergencyEvent{" +
                "Emergency_Event_ID=" + Emergency_Event_ID +
                ", Event_Date=" + Event_Date +
                '}';
    }
}
