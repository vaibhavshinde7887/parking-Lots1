package org.parkinglot;

public class Vehicle {
    private String licensePlate;
    private String color;
    private VehicleType type;

    public Vehicle(String licensePlate, String color, VehicleType type) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.type = type;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getType() {
        return type;
    }
}