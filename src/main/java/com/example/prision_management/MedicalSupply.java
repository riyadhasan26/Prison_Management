package com.example.prision_management;

public class MedicalSupply {

    private String supplyName;
    private int quantity;

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public MedicalSupply(int quantity, String supplyName) {
        this.quantity = quantity;
        this.supplyName = supplyName;
    }


    @Override
    public String toString() {
        return "MedicalSupply{" +
                "supplyName='" + supplyName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
