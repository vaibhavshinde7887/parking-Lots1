package org.parkinglot;

public class VehicleSpace {
    private int spaceNumber;
    private VehicleType type;
    private boolean available;

    public VehicleSpace(int spaceNumber, VehicleType type) {
        this.spaceNumber = spaceNumber;
        this.type = type;
        this.available = true;
    }

    public int getSpaceNumber() {
        return spaceNumber;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }

    public void occupy() {
        this.available = false;
    }

    public void vacate() {
        this.available = true;
    }
}