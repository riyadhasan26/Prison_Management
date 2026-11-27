package com.example.prision_management;

public class searchprisoner {
    private int id;
    private string name;

    public searchprisoner(int id, string name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public string getName() {
        return name;
    }

    public void setName(string name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "searchprisoner{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
