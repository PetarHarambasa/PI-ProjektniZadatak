package hr.algebra.pi.factory;

import hr.algebra.pi.model.BigBus;
import hr.algebra.pi.model.BigTruck;
import hr.algebra.pi.model.IVehicle;

public class BigVehicleFactory extends VehicleFactory{
    @Override
    public IVehicle createVehicle(String type) {
        return switch (type.toLowerCase()) {
            case "bus" -> new BigBus();
            case "truck" -> new BigTruck();
            default -> null;
        };
    }
}
