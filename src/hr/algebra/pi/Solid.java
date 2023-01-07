package hr.algebra.pi;

import hr.algebra.pi.model.Employee;
import hr.algebra.pi.model.Terminal;
import hr.algebra.pi.model.Vehicle;

public class Solid {
    public static void main(String[] args) {
        Terminal terminal = new Terminal();

        Employee employee1 = new Employee("employee1");
        Employee employee2 = new Employee("employee2");
        terminal.addEmployee(employee1);
        terminal.addEmployee(employee2);

        Vehicle smallCar = new Vehicle("small", "car", 50, 75);
        Vehicle smallVan = new Vehicle("small", "van", 0, 0);
        Vehicle largeBus = new Vehicle("large", "bus", 75, 90);
        Vehicle largeTruck = new Vehicle("large", "truck", 0, 0);

        terminal.checkInVehicle(employee1, smallCar);
        terminal.checkInVehicle(employee2, smallVan);
        terminal.checkInVehicle(employee1, largeBus);
        terminal.checkInVehicle(employee2, largeTruck);

        terminal.checkOutVehicle(smallCar);
        terminal.checkOutVehicle(smallVan);
        terminal.checkOutVehicle(largeBus);
        terminal.checkOutVehicle(largeTruck);

        terminal.displayTotalRevenue();
        terminal.displayEmployeeEarnings(employee1);
        terminal.displayEmployeeEarnings(employee2);
    }
}
