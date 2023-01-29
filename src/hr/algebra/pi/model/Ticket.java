package hr.algebra.pi.model;

public class Ticket {
    double price;
    IVehicle vehicle;

    public Ticket(IVehicle vehicle) {
        this.vehicle = vehicle;
        this.price = vehicle.getPrice();
    }
}
