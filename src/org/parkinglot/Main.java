package org.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<VehicleType, Integer> capacityPerFloor = new HashMap<>();
        capacityPerFloor.put(VehicleType.CAR, 2);

        ParkingLot parkingLot = new ParkingLot(2, capacityPerFloor);

        Vehicle car1 = new Vehicle("KNO123", "Yellow", VehicleType.CAR);
        Vehicle car2 = new Vehicle("REX456", "Purple", VehicleType.CAR);

        parkingLot.addVehicle(car1, 1);
        parkingLot.addVehicle(car2, 1);

        parkingLot.printAvailability(1, VehicleType.CAR);

        Vehicle car3 = new Vehicle("DEF789", "Green", VehicleType.CAR);
        parkingLot.addVehicle(car3, 1);

        parkingLot.removeVehicle("KNO123", VehicleType.CAR);

        parkingLot.printAvailability(1, VehicleType.CAR);

        parkingLot.calculateCost("KNO123", VehicleType.CAR, 2);
    }
}