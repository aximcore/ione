package me.aximcore.controller.formatter;

import me.aximcore.model.vehicle.PeripherialsType;
import me.aximcore.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by aximcore on 2017.05.28..
 */
public class PeripherialsTypeFormatter implements Formatter<PeripherialsType> {
    @Autowired
    private VehicleService vehicleService;

    @Override
    public PeripherialsType parse(String s, Locale locale) throws ParseException {
        return vehicleService.getPeripherialType(Integer.parseInt(s));
    }

    @Override
    public String print(PeripherialsType peripherialsType, Locale locale) {
        return null;
    }
}
