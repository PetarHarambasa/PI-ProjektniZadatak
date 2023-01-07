package hr.algebra.pi.model;

import java.util.ArrayList;

public class Train {
    private String size;
    private int capacity;
    private ArrayList<Vehicle> vehicles;

    public Train(String size, int capacity) {
        this.size = size;
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    public boolean addVehicle(Vehicle vehicle) {
        if (vehicles.size() < capacity) {
            vehicles.add(vehicle);
            return true;
        }
        return false;
    }

    public boolean removeVehicle(Vehicle vehicle) {
        return vehicles.remove(vehicle);
    }
}
