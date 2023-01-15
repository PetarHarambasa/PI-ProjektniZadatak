package hr.algebra.pi;

import hr.algebra.pi.model.*;
import java.util.Scanner;

public class Solid {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the car transportation terminal!");
            System.out.println("1. Park a vehicle");
            System.out.println("2. Check revenue and occupancy");
            System.out.println("3. Exit");
            System.out.print("Please choose an option: ");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Please enter the vehicle type (car, van, bus, truck): ");
                String vehicleType = input.next();
                System.out.print("Please enter the vehicle size (small, big): ");
                String vehicleSize = input.next();
                System.out.print("Please enter the vehicle's current gas level (0-1): ");
                double gasLevel = input.nextDouble();
                System.out.print("Please enter the vehicle's current battery level (0-1): ");
                double batteryLevel = input.nextDouble();
                if(terminal.parkVehicle(vehicleType, vehicleSize, gasLevel, batteryLevel)) {
                    System.out.println("Vehicle parked successfully.");
                }
            } else if (choice == 2) {
                terminal.checkRevenueAndOccupancy();
            } else if (choice == 3) {
                System.out.println("Thank you for using our terminal. Have a nice day!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

