package hr.algebra.pi.model;

public class SmallCar implements IVehicle {
    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public boolean isSmall() {
        return true;
    }
}
