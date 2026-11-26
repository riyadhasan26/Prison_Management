package com.example.prision_management;

public class assignedPrisoners {
    private int  Assignment_ID;
    private LocalDate Assignment_Date;


    public assignedPrisoners(int assignment_ID, LocalDate assignment_Date) {
        Assignment_ID = assignment_ID;
        Assignment_Date = assignment_Date;
    }

    public int getAssignment_ID() {
        return Assignment_ID;
    }

    public void setAssignment_ID(int assignment_ID) {
        Assignment_ID = assignment_ID;
    }

    public LocalDate getAssignment_Date() {
        return Assignment_Date;
    }

    public void setAssignment_Date(LocalDate assignment_Date) {
        Assignment_Date = assignment_Date;
    }

    @Override
    public String toString() {
        return "assignedPrisoners{" +
                "Assignment_ID=" + Assignment_ID +
                ", Assignment_Date=" + Assignment_Date +
                '}';
    }
}
