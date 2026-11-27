package com.example.prision_management;

public class PrisionInformation {

    private int prisionCapacity;
    private String security;
    private int inmateCount;

    public PrisionInformation(int prisionCapacity, String security, int inmateCount) {
        this.prisionCapacity = prisionCapacity;
        this.security = security;
        this.inmateCount = inmateCount;
    }

    public int getPrisionCapacity() {
        return prisionCapacity;
    }

    public void setPrisionCapacity(int prisionCapacity) {
        this.prisionCapacity = prisionCapacity;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public int getInmateCount() {
        return inmateCount;
    }

    public void setInmateCount(int inmateCount) {
        this.inmateCount = inmateCount;
    }

    @Override
    public String toString() {
        return "PrisionInformation{" +
                "prisionCapacity=" + prisionCapacity +
                ", security='" + security + '\'' +
                ", inmateCount=" + inmateCount +
                '}';
    }
}
