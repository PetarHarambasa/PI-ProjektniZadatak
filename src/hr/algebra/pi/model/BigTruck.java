package hr.algebra.pi.model;

public class BigTruck implements IVehicle {
    @Override
    public double getPrice() {
        return 90;
    }

    @Override
    public boolean isSmall() {
        return false;
    }
}
