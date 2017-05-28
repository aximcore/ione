package me.aximcore.dao.impl;

import me.aximcore.dao.VehicleDao;
import me.aximcore.model.vehicle.*;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by aximcore on 2017.05.25..
 */
@Component
@Transactional
public class VehicleDaoImpl implements VehicleDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public List<Vehicle> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Vehicle").list();
    }

    @Override
    public Vehicle get(int vehicleId) {
        return sessionFactory.getCurrentSession().get(Vehicle.class, vehicleId);
    }

    @Override
    public void create(Vehicle vehicle) {
        sessionFactory.getCurrentSession().save(vehicle);
    }

    @Override
    public void remove(Vehicle vehicle) {
        sessionFactory.getCurrentSession().delete(vehicle);
    }

    @Override
    public List<Config> getAllConfig() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Config")
                .list();
    }

    @Override
    public Config getConfig(int configId) {
        return sessionFactory.getCurrentSession()
                .get(Config.class, configId);
    }

    @Override
    public void createConfig(Config config) {
        sessionFactory.getCurrentSession().save(config);
    }

    @Override
    public void removeConfig(Config config) {
        sessionFactory.getCurrentSession().delete(config);
    }

    @Override
    public List<Unit> getAllUnit() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Unit")
                .list();
    }

    @Override
    public Unit getUnit(int unitId) {
        return sessionFactory.getCurrentSession()
                .get(Unit.class, unitId);
    }

    @Override
    public void createUnit(Unit unit) {
        sessionFactory.getCurrentSession().save(unit);
    }

    @Override
    public void removeUnit(Unit unit) {
        sessionFactory.getCurrentSession().delete(unit);
    }

    @Override
    public List<Peripherials> getAllPeripherial() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Peripherials")
                .list();
    }

    @Override
    public Peripherials getPeripherial(int peripherialId) {
        return sessionFactory.getCurrentSession()
                .get(Peripherials.class, peripherialId);
    }

    @Override
    public void createPeripherial(Peripherials peripherials) {
        sessionFactory.getCurrentSession().save(peripherials);
    }

    @Override
    public void removePeripherial(Peripherials peripherials) {
        sessionFactory.getCurrentSession().delete(peripherials);
    }

    @Override
    public List<PeripherialsType> getAllPeripherialsType() {
        return sessionFactory.getCurrentSession()
                .createQuery("from PeripherialsType")
                .list();
    }

    @Override
    public PeripherialsType getPeripherialType(int typeId) {
        return sessionFactory.getCurrentSession()
                .get(PeripherialsType.class, typeId);
    }

    @Override
    public void createPeripherialType(PeripherialsType peripherialsType) {
        sessionFactory.getCurrentSession().save(peripherialsType);
    }

    @Override
    public void removePeripherialType(PeripherialsType peripherialsType) {
        sessionFactory.getCurrentSession().delete(peripherialsType);
    }

    @Override
    public List<UnitType> getAllUnitType() {
        return sessionFactory.getCurrentSession()
                .createQuery("from UnitType")
                .list();
    }

    @Override
    public UnitType getUnitType(int unitTypeId) {
        return sessionFactory.getCurrentSession()
                .get(UnitType.class, unitTypeId);
    }

    @Override
    public void createUnitType(UnitType unitType) {
        sessionFactory.getCurrentSession().save(unitType);
    }

    @Override
    public void removeunitType(UnitType unitType) {
        sessionFactory.getCurrentSession().delete(unitType);

    }

    @Override
    public List<PeripherialsGroup> getAllPreipherialsGroup() {
        return sessionFactory.getCurrentSession()
                .createQuery("from PeripherialsGroup")
                .list();
    }

    @Override
    public PeripherialsGroup getPeripherialsGroup(int pGroupId) {
        return sessionFactory.getCurrentSession()
                .get(PeripherialsGroup.class, pGroupId);
    }

    @Override
    public void createPeripherialsGroup(PeripherialsGroup peripherialsGroup) {
        sessionFactory.getCurrentSession().save(peripherialsGroup);
    }

    @Override
    public void removePeripherialsGroup(PeripherialsGroup peripherialsGroup) {
        sessionFactory.getCurrentSession().delete(peripherialsGroup);
    }

    @Override
    public List<CommunicationProtocol> getAllProtocol() {
        return sessionFactory.getCurrentSession()
                .createQuery("from CommunicationProtocol")
                .list();
    }

    @Override
    public CommunicationProtocol getProtocol(int protoId) {
        return sessionFactory.getCurrentSession()
                .get(CommunicationProtocol.class, protoId);
    }

    @Override
    public void createCommunicationProtocol(CommunicationProtocol communicationProtocol) {
        sessionFactory.getCurrentSession().save(communicationProtocol);
    }

    @Override
    public void removeCommunicationProtocol(CommunicationProtocol communicationProtocol) {
        sessionFactory.getCurrentSession().delete(communicationProtocol);
    }

    @Override
    public List<SimCard> getAllSimCard() {
        return sessionFactory.getCurrentSession()
                .createQuery("from SimCard")
                .list();
    }

    @Override
    public SimCard getSimCard(int SimCardId) {
        return sessionFactory.getCurrentSession()
                .get(SimCard.class, SimCardId);
    }

    @Override
    public void createSimCard(SimCard simCard) {
        sessionFactory.getCurrentSession()
                .save(simCard);
    }

    @Override
    public void removeSimCard(SimCard simCard) {
        sessionFactory.getCurrentSession()
                .delete(simCard);
    }
}
