package me.aximcore.service;

import me.aximcore.model.vehicle.Peripherials;
import me.aximcore.model.vehicle.Unit;
import me.aximcore.model.vehicle.Vehicle;

import java.util.List;

/**
 * Created by aximc on 2017. 04. 26..
 */
public interface VehicleService {
    Vehicle get(int vehicleId);
    List<Vehicle> getAll();
    void remove(Vehicle vehicle);
}
