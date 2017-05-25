package me.aximcore.dao;

import me.aximcore.model.vehicle.*;

import java.util.List;

/**
 * Created by aximcore on 2017.05.24..
 */
public interface VehicleDao {
    List<Vehicle> getAll();
    Vehicle get(int vehicleId);
    void create(Vehicle vehicle);
    void remove(Vehicle vehicle);

    void createConfig(Config config);
    void removeConfig(Config config);

    void createUnit(Unit unit);
    void removeUnit(Unit unit);

    void createPeripherial(Peripherials peripherials);
    void removePeripherial(Peripherials peripherials);

    void createPeripherialType(PeripherialsType peripherialsType);
    void removePeripherialType(PeripherialsType peripherialsType);

    void createUnitType(UnitType unitType);
    void removeunitType(UnitType unitType);

    void createPeripherialsGroup(PeripherialsGroup peripherialsGroup);
    void removePeripherialsGroup(PeripherialsGroup peripherialsGroup);

    void createCommunicationProtocol(CommunicationProtocol communicationProtocol);
    void removeCommunicationProtocol(CommunicationProtocol communicationProtocol);
}
