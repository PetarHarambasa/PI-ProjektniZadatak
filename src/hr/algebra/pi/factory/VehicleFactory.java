package hr.algebra.pi.factory;

import hr.algebra.pi.model.IVehicle;

public abstract class VehicleFactory {
    public abstract IVehicle createVehicle(String type);
}
