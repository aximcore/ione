package me.aximcore.service.impl;

import me.aximcore.dao.VehicleDao;
import me.aximcore.model.vehicle.Vehicle;
import me.aximcore.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by aximcore on 2017.05.25..
 */
@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleDao vehicleDao;

    @Override
    public Vehicle get(int vehicleId) {
        return vehicleDao.get(vehicleId);
    }

    @Override
    public List<Vehicle> getAll() {
        return vehicleDao.getAll();
    }

    @Override
    public void remove(Vehicle vehicle) {
        vehicleDao.remove(vehicle);
    }
}
