package com.example.prision_management;

public class complianceChecks {
    private int Compliance_ID;
    private string Check_Type;
    private LocalDate Check_Date;

    public complianceChecks(int compliance_ID, string check_Type, LocalDate check_Date) {
        Compliance_ID = compliance_ID;
        Check_Type = check_Type;
        Check_Date = check_Date;
    }

    public int getCompliance_ID() {
        return Compliance_ID;
    }

    public void setCompliance_ID(int compliance_ID) {
        Compliance_ID = compliance_ID;
    }

    public string getCheck_Type() {
        return Check_Type;
    }

    public void setCheck_Type(string check_Type) {
        Check_Type = check_Type;
    }

    public LocalDate getCheck_Date() {
        return Check_Date;
    }

    public void setCheck_Date(LocalDate check_Date) {
        Check_Date = check_Date;
    }

    @Override
    public String toString() {
        return "complianceChecks{" +
                "Compliance_ID=" + Compliance_ID +
                ", Check_Type=" + Check_Type +
                ", Check_Date=" + Check_Date +
                '}';
    }
}
