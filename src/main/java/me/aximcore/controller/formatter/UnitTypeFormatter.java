package me.aximcore.controller.formatter;

import me.aximcore.model.vehicle.UnitType;
import me.aximcore.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by aximcore on 2017.05.28..
 */
public class UnitTypeFormatter implements Formatter<UnitType> {
    @Autowired
    private VehicleService vehicleService;

    @Override
    public UnitType parse(String s, Locale locale) throws ParseException {
        return vehicleService.getUnitType(Integer.parseInt(s));
    }

    @Override
    public String print(UnitType unitType, Locale locale) {
        return null;
    }
}
