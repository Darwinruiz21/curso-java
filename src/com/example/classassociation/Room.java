package com.example.classassociation;

public class Room {

    private Integer m2;
    private Integer numWindows;
    private Boolean airConditioner;

    public Room()

    public Room(Integer m2, Integer numWindows, Boolean airConditioner) {
        this.m2 = m2;
        this.numWindows = numWindows;
        this.airConditioner = airConditioner;
    }

    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    public Integer getNumWindows() {
        return numWindows;
    }

    public void setNumWindows(Integer numWindows) {
        this.numWindows = numWindows;
    }

    public Boolean getAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(Boolean airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public String toString() {
        return "Room{" +
                "m2=" + m2 +
                ", numWindows=" + numWindows +
                ", airConditioner=" + airConditioner +
                '}';
    }
}
