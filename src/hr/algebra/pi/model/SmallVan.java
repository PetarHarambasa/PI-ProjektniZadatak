package hr.algebra.pi.model;

public class SmallVan implements IVehicle {
    @Override
    public double getPrice() {
        return 80;
    }

    @Override
    public boolean isSmall() {
        return true;
    }
}
