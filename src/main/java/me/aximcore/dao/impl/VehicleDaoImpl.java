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
    public void createConfig(Config config) {
        sessionFactory.getCurrentSession().save(config);
    }

    @Override
    public void removeConfig(Config config) {
        sessionFactory.getCurrentSession().delete(config);
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
    public void createPeripherial(Peripherials peripherials) {
        sessionFactory.getCurrentSession().save(peripherials);
    }

    @Override
    public void removePeripherial(Peripherials peripherials) {
        sessionFactory.getCurrentSession().delete(peripherials);
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
    public void createUnitType(UnitType unitType) {
        sessionFactory.getCurrentSession().save(unitType);
    }

    @Override
    public void removeunitType(UnitType unitType) {
        sessionFactory.getCurrentSession().delete(unitType);

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
    public void createCommunicationProtocol(CommunicationProtocol communicationProtocol) {
        sessionFactory.getCurrentSession().save(communicationProtocol);
    }

    @Override
    public void removeCommunicationProtocol(CommunicationProtocol communicationProtocol) {
        sessionFactory.getCurrentSession().delete(communicationProtocol);
    }
}
