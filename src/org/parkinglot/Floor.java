package org.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class Floor {
    private int floorNumber;
    private Map<VehicleType, Integer> capacity;
    private Map<Integer, VehicleSpace> spaces;

    public Floor(int floorNumber, Map<VehicleType, Integer> capacity) {
        this.floorNumber = floorNumber;
        this.capacity = capacity;
        this.spaces = new HashMap<>();
        initializeSpaces();
    }

    private void initializeSpaces() {
        int spaceNumber = 1;
        for (Map.Entry<VehicleType, Integer> entry : capacity.entrySet()) {
            VehicleType type = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                spaces.put(spaceNumber, new VehicleSpace(spaceNumber, type));
                spaceNumber++;
            }
        }
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public Map<VehicleType, Integer> getCapacity() {
        return capacity;
    }

    public Map<Integer, VehicleSpace> getSpaces() {
        return spaces;
    }
}