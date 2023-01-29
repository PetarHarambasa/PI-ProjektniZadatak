package hr.algebra.pi.factory;

import hr.algebra.pi.model.IVehicle;
import hr.algebra.pi.model.SmallCar;
import hr.algebra.pi.model.SmallVan;

public class SmallVehicleFactory extends VehicleFactory{
    @Override
    public IVehicle createVehicle(String type) {
        return switch (type.toLowerCase()) {
            case "car" -> new SmallCar();
            case "van" -> new SmallVan();
            default -> null;
        };
    }
}
