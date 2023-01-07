package hr.algebra.pi.model;

public class Vehicle {
    String size;
    String type;
    int gasLevel;
    int batteryLevel;

    public Vehicle(String size, String type, int gasLevel, int batteryLevel) {
        this.size = size;
        this.type = type;
        this.gasLevel = gasLevel;
        this.batteryLevel = batteryLevel;
    }

    public void refillGas() {
        gasLevel = 100;
    }

    public void rechargeBattery() {
        batteryLevel = 100;
    }
}
