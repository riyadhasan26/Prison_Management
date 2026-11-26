package com.example.prision_management;

public class searchRecords {
    private int search_id;
    private string record_type;

    public searchRecords(int search_id, string record_type) {
        this.search_id = search_id;
        this.record_type = record_type;
    }

    public int getSearch_id() {
        return search_id;
    }

    public void setSearch_id(int search_id) {
        this.search_id = search_id;
    }

    public string getRecord_type() {
        return record_type;
    }

    public void setRecord_type(string record_type) {
        this.record_type = record_type;
    }

    @Override
    public String toString() {
        return "searchRecords{" +
                "search_id=" + search_id +
                ", record_type=" + record_type +
                '}';
    }
}
