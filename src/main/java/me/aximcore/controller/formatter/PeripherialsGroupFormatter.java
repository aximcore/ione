package me.aximcore.controller.formatter;

import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import me.aximcore.model.vehicle.PeripherialsGroup;
import me.aximcore.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by aximcore on 2017.05.28..
 */
public class PeripherialsGroupFormatter implements Formatter<PeripherialsGroup> {
    @Autowired
    private VehicleService vehicleService;

    @Override
    public PeripherialsGroup parse(String s, Locale locale) throws ParseException {
        return vehicleService.getPeripherialsGroup(Integer.parseInt(s));
    }

    @Override
    public String print(PeripherialsGroup peripherialsGroup, Locale locale) {
        return null;
    }
}
