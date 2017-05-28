package me.aximcore.controller.formatter;

import me.aximcore.model.vehicle.Config;
import me.aximcore.model.vehicle.Vehicle;
import me.aximcore.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by aximcore on 2017.05.28..
 */
public class ConfigFormatter implements Formatter<Config> {

    @Autowired
    private VehicleService vehicleService;

    @Override
    public Config parse(String s, Locale locale) throws ParseException {
        return vehicleService.getConfig(Integer.parseInt(s));
    }

    @Override
    public String print(Config config, Locale locale) {
        return null;
    }
}
