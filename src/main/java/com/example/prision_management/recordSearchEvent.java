package com.example.prision_management;

public class recordSearchEvent {
    private int Search_Event_ID;
    private string Search_Type;

    public recordSearchEvent(int search_Event_ID, string search_Type) {
        Search_Event_ID = search_Event_ID;
        Search_Type = search_Type;
    }

    public int getSearch_Event_ID() {
        return Search_Event_ID;
    }

    public void setSearch_Event_ID(int search_Event_ID) {
        Search_Event_ID = search_Event_ID;
    }

    public string getSearch_Type() {
        return Search_Type;
    }

    public void setSearch_Type(string search_Type) {
        Search_Type = search_Type;
    }

    @Override
    public String toString() {
        return "recordSearchEvent{" +
                "Search_Event_ID=" + Search_Event_ID +
                ", Search_Type=" + Search_Type +
                '}';
    }
}
