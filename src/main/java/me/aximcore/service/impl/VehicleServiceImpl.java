package me.aximcore.service.impl;

import me.aximcore.dao.VehicleDao;
import me.aximcore.model.vehicle.*;
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

    @Override
    public void create(Vehicle vehicle) {
        vehicleDao.create(vehicle);
    }

    @Override
    public List<Config> getAllConfig() {
        return vehicleDao.getAllConfig();
    }

    @Override
    public Config getConfig(int configId) {
        return vehicleDao.getConfig(configId);
    }

    @Override
    public void createConfig(Config config) {
        vehicleDao.createConfig(config);
    }

    @Override
    public void removeConfig(Config config) {
        vehicleDao.removeConfig(config);
    }

    @Override
    public List<Unit> getAllUnit() {
        return vehicleDao.getAllUnit();
    }

    @Override
    public Unit getUnit(int unitId) {
        return vehicleDao.getUnit(unitId);
    }

    @Override
    public void createUnit(Unit unit) {
        vehicleDao.createUnit(unit);
    }

    @Override
    public void removeUnit(Unit unit) {
        vehicleDao.removeUnit(unit);
    }

    @Override
    public List<Peripherials> getAllPeripherial() {
        return vehicleDao.getAllPeripherial();
    }

    @Override
    public Peripherials getPeripherial(int peripherialId) {
        return vehicleDao.getPeripherial(peripherialId);
    }

    @Override
    public void createPeripherial(Peripherials peripherials) {
        vehicleDao.createPeripherial(peripherials);
    }

    @Override
    public void removePeripherial(Peripherials peripherials) {
        vehicleDao.removePeripherial(peripherials);
    }

    @Override
    public List<PeripherialsType> getAllPeripherialsType() {
        return vehicleDao.getAllPeripherialsType();
    }

    @Override
    public PeripherialsType getPeripherialType(int typeId) {
        return vehicleDao.getPeripherialType(typeId);
    }

    @Override
    public void createPeripherialType(PeripherialsType peripherialsType) {
        vehicleDao.createPeripherialType(peripherialsType);
    }

    @Override
    public void removePeripherialType(PeripherialsType peripherialsType) {
        vehicleDao.removePeripherialType(peripherialsType);
    }

    @Override
    public List<UnitType> getAllUnitType() {
        return vehicleDao.getAllUnitType();
    }

    @Override
    public UnitType getUnitType(int unitTypeId) {
        return vehicleDao.getUnitType(unitTypeId);
    }

    @Override
    public void createUnitType(UnitType unitType) {
        vehicleDao.createUnitType(unitType);
    }

    @Override
    public void removeunitType(UnitType unitType) {
        vehicleDao.removeunitType(unitType);
    }

    @Override
    public List<PeripherialsGroup> getAllPreipherialsGroup() {
        return vehicleDao.getAllPreipherialsGroup();
    }

    @Override
    public PeripherialsGroup getPeripherialsGroup(int pGroupId) {
        return vehicleDao.getPeripherialsGroup(pGroupId);
    }

    @Override
    public void createPeripherialsGroup(PeripherialsGroup peripherialsGroup) {
        vehicleDao.createPeripherialsGroup(peripherialsGroup);
    }

    @Override
    public void removePeripherialsGroup(PeripherialsGroup peripherialsGroup) {
        vehicleDao.removePeripherialsGroup(peripherialsGroup);
    }

    @Override
    public List<CommunicationProtocol> getAllProtocol() {
        return vehicleDao.getAllProtocol();
    }

    @Override
    public CommunicationProtocol getProtocol(int protoId) {
        return vehicleDao.getProtocol(protoId);
    }

    @Override
    public void createCommunicationProtocol(CommunicationProtocol communicationProtocol) {
        vehicleDao.createCommunicationProtocol(communicationProtocol);
    }

    @Override
    public void removeCommunicationProtocol(CommunicationProtocol communicationProtocol) {
        vehicleDao.removeCommunicationProtocol(communicationProtocol);
    }

    @Override
    public List<SimCard> getAllSimCard() {
        return vehicleDao.getAllSimCard();
    }

    @Override
    public SimCard getSimCard(int SimCardId) {
        return vehicleDao.getSimCard(SimCardId);
    }

    @Override
    public void createSimCard(SimCard simCard) {
        vehicleDao.createSimCard(simCard);
    }

    @Override
    public void removeSimCard(SimCard simCard) {
        vehicleDao.removeSimCard(simCard);
    }
}
