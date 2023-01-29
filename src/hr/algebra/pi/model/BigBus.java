package hr.algebra.pi.model;

public class BigBus implements IVehicle {
    @Override
    public double getPrice() {
        return 70;
    }

    @Override
    public boolean isSmall() {
        return false;
    }
}
