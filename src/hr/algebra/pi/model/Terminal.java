package hr.algebra.pi.model;

import hr.algebra.pi.factory.BigVehicleFactory;
import hr.algebra.pi.factory.SmallVehicleFactory;
import hr.algebra.pi.factory.VehicleFactory;

public class Terminal {
    private int smallTrainCapacity = 2;
    private int bigTrainCapacity = 6;
    private int smallTrainOccupancy = 0;
    private int bigTrainOccupancy = 0;
    private double totalRevenue = 0;
    private Employee employee1 = new Employee(0.1);
    private Employee employee2 = new Employee(0.11);
    private double employee1Revenue = 0;
    private double employee2Revenue = 0;
    private double minGasThreshold = 0.1;
    private double minBatteryThreshold = 0.1;

    private VehicleFactory smallVehicleFactory = new SmallVehicleFactory();
    private VehicleFactory bigVehicleFactory = new BigVehicleFactory();

    public boolean parkVehicle(String type, String size, double gasLevel, double batteryLevel) {
        IVehicle vehicle = null;
        if (size.equalsIgnoreCase("small")) {
            vehicle = smallVehicleFactory.createVehicle(type);
            if (vehicle == null) {
                System.out.println("Invalid vehicle type. Please try again.");
                return false;
            }
            if (smallTrainOccupancy >= smallTrainCapacity) {
                System.out.println("Sorry, there is no space available on the train for this vehicle type. Please try again later.");
                return false;
            }
            smallTrainOccupancy++;
        } else {
            vehicle = bigVehicleFactory.createVehicle(type);
            if (bigTrainOccupancy >= bigTrainCapacity) {
                System.out.println("Sorry, there is no space available on the train for this vehicle type. Please try again later.");
                return false;
            }
            bigTrainOccupancy++;
        }

        if (vehicle == null) {
            System.out.println("Invalid vehicle type. Please try again.");
            return false;
        }

        if (gasLevel < minGasThreshold) {
            System.out.println("The vehicle's gas level is too low. An employee will need to fill it up at the gas station.");
        }

        if (batteryLevel < minBatteryThreshold) {
            System.out.println("The vehicle's battery level is too low. An employee will need to charge it at the battery station.");
        }

        Ticket ticket = new Ticket(vehicle);
        totalRevenue += ticket.price;
        employee1Revenue += ticket.price * employee1.getCommission();
        employee2Revenue += ticket.price * employee2.getCommission();
        System.out.println("Thank you for parking your vehicle at our terminal. Your ticket price is " + ticket.price + " €.");
        return true;
    }

    public void checkRevenueAndOccupancy() {
        System.out.println("Total revenue: " + totalRevenue + " kn");
        System.out.println("Employee 1 revenue: " + employee1Revenue + " kn");
        System.out.println("Employee 2 revenue: " + employee2Revenue + " kn");
        System.out.println("Small train occupancy: " + smallTrainOccupancy + " / " + smallTrainCapacity);
        System.out.println("Big train occupancy: " + bigTrainOccupancy + " / " + bigTrainCapacity);
    }

    public int getSmallTrainOccupancy() {
        return smallTrainOccupancy;
    }

    public int getBigTrainOccupancy() {
        return bigTrainOccupancy;
    }

    public void setSmallTrainOccupancy(int smallTrainOccupancy) {
        this.smallTrainOccupancy = smallTrainOccupancy;
    }

    public void setBigTrainOccupancy(int bigTrainOccupancy) {
        this.bigTrainOccupancy = bigTrainOccupancy;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }
}

