package me.aximcore.service;

import me.aximcore.model.vehicle.*;

import java.util.List;

/**
 * Created by aximc on 2017. 04. 26..
 */
public interface VehicleService {
    Vehicle get(int vehicleId);
    List<Vehicle> getAll();
    void remove(Vehicle vehicle);
    void create(Vehicle vehicle);

    List<Config> getAllConfig();
    Config getConfig(int configId);
    void createConfig(Config config);
    void removeConfig(Config config);

    List<Unit> getAllUnit();
    Unit getUnit(int unitId);
    void createUnit(Unit unit);
    void removeUnit(Unit unit);

    List<Peripherials> getAllPeripherial();
    Peripherials getPeripherial(int peripherialId);
    void createPeripherial(Peripherials peripherials);
    void removePeripherial(Peripherials peripherials);

    List<PeripherialsType> getAllPeripherialsType();
    PeripherialsType getPeripherialType(int typeId);
    void createPeripherialType(PeripherialsType peripherialsType);
    void removePeripherialType(PeripherialsType peripherialsType);

    List<UnitType> getAllUnitType();
    UnitType getUnitType(int unitTypeId);
    void createUnitType(UnitType unitType);
    void removeunitType(UnitType unitType);

    List<PeripherialsGroup> getAllPreipherialsGroup();
    PeripherialsGroup getPeripherialsGroup(int pGroupId);
    void createPeripherialsGroup(PeripherialsGroup peripherialsGroup);
    void removePeripherialsGroup(PeripherialsGroup peripherialsGroup);

    List<CommunicationProtocol> getAllProtocol();
    CommunicationProtocol getProtocol(int protoId);
    void createCommunicationProtocol(CommunicationProtocol communicationProtocol);
    void removeCommunicationProtocol(CommunicationProtocol communicationProtocol);

    List<SimCard> getAllSimCard();
    SimCard getSimCard(int SimCardId);
    void createSimCard(SimCard simCard);
    void removeSimCard(SimCard simCard);
}
