package hr.algebra.pi.model;

import hr.algebra.pi.configuration.EmployeePayRates;
import hr.algebra.pi.configuration.TicketPrices;

import java.util.ArrayList;

public class Terminal {
    private final Train smallTrain;
    private final Train largeTrain;
    private ArrayList<Employee> employees;
    private int totalRevenue;

    public Terminal() {
        smallTrain = new Train("small", 8);
        largeTrain = new Train("large", 6);
        employees = new ArrayList<>();
        totalRevenue = 0;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void checkInVehicle(Employee employee, Vehicle vehicle) {
        int ticketPrice = 0;
        if (vehicle.size.equals("small")) {
            if (smallTrain.addVehicle(vehicle)) {
                if (vehicle.type.equals("car")) {
                    ticketPrice = TicketPrices.SMALL_VEHICLE_CAR_PRICE;
                } else if (vehicle.type.equals("van")) {
                    ticketPrice = TicketPrices.SMALL_VEHICLE_VAN_PRICE;
                }
            }
        } else if (vehicle.size.equals("large")) {
            if (largeTrain.addVehicle(vehicle)) {
                if (vehicle.type.equals("bus")) {
                    ticketPrice = TicketPrices.LARGE_VEHICLE_BUS_PRICE;
                } else if (vehicle.type.equals("truck")) {
                    ticketPrice = TicketPrices.LARGE_VEHICLE_TRUCK_PRICE;
                }
            }
        }

        if (ticketPrice > 0) {
            double earnings = ticketPrice * EmployeePayRates.getRate(employee.getName());
            employee.setEarnings(employee.getEarnings() + earnings);
            totalRevenue += ticketPrice;
        }

        System.out.println(vehicle.type + " " + vehicle.size + " on checking!");
        System.out.println("Vehicle gas level: " + vehicle.gasLevel + "%");
        if (vehicle.gasLevel < 10) {
            System.out.println("Vehicle gas level below 10%, refilling...");
            vehicle.refillGas();
            System.out.println("Vehicle gas level: " + vehicle.gasLevel + "%");
        }
        System.out.println("Vehicle battery level: " + vehicle.batteryLevel + "%");
        if (vehicle.batteryLevel < 10) {
            System.out.println("Vehicle battery level below 10%, recharge...");
            vehicle.rechargeBattery();
            System.out.println("Vehicle battery level: " + vehicle.batteryLevel + "%");
        }
    }

    public void checkOutVehicle(Vehicle vehicle) {
        if (vehicle.size.equals("small")) {
            smallTrain.removeVehicle(vehicle);
        } else if (vehicle.size.equals("large")) {
            largeTrain.removeVehicle(vehicle);
        }
    }

    public void displayTotalRevenue() {
        System.out.println("Total revenue: " + totalRevenue + " €");
    }

    public void displayEmployeeEarnings(Employee employee) {
        System.out.println("Earnings for " + employee.getName() + ": " + employee.getEarnings() + " €");
    }
}
