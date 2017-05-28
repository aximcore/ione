package me.aximcore.controller;

import me.aximcore.model.user.Users;
import me.aximcore.model.vehicle.*;
import me.aximcore.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by aximcore on 2017.05.28..
 */
@Controller
public class VehicleController extends LoggedUserHead {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicle")
    public String vehicleList(Model model){
        model.addAttribute("vehicles", vehicleService.getAll());
        return "vehicle/view";
    }

    @GetMapping("/vehicle/create")
    public String createVehicle(Model model){
        model.addAttribute("vehicle", new Vehicle());
        return "vehicle/create";
    }

    @PostMapping("/vehicle/create")
    public String createVehiclePost(@ModelAttribute Vehicle vehicle,
                                    Model model) {
        model.addAttribute("vehicle", vehicle);
        vehicleService.create(vehicle);
        return "vehicle/create";
    }

    /******************************************************/
    @GetMapping("/protocol")
    public String protocolList(Model model) {
        model.addAttribute("protocols", vehicleService.getAllProtocol());
        return "protocol/view";
    }

    @GetMapping("/protocol/create")
    public String createProtocol(Model model) {
        model.addAttribute("protocol", new CommunicationProtocol());
        return "protocol/create";
    }

    @PostMapping("/protocol/create")
    public String createProtocolPost(@ModelAttribute CommunicationProtocol protocol,
                                     Model model) {
        model.addAttribute("protocol", protocol);
        vehicleService.createCommunicationProtocol(protocol);
        return "protocol/create";
    }

    /******************************************************/

    @GetMapping("/unit_type")
    public String unityTypeList(Model model) {
        model.addAttribute("unittypes", vehicleService.getAllUnitType());
        return "unit_type/view";
    }

    @GetMapping("/unit_type/create")
    public String unityTypeCreate(Model model) {
        model.addAttribute("unitType", new UnitType());
        return "unit_type/create";
    }

    @PostMapping("/unit_type/create")
    public String unityTypeCreatePost(@ModelAttribute UnitType unitType,
                                      Model model) {
        model.addAttribute("unitType", unitType);
        vehicleService.createUnitType(unitType);
        return "unit_type/create";
    }

    /******************************************************/

    @GetMapping("/peripherials_group")
    public String peripherialGroupList(Model model) {
        model.addAttribute("peripherials_group", vehicleService.getAllPreipherialsGroup());
        return "peripherials_group/view";
    }

    @GetMapping("/peripherials_group/create")
    public String peripherialGroupCreate(Model model) {
        model.addAttribute("peripherialGroup", new PeripherialsGroup());
        return "peripherials_group/create";
    }

    @PostMapping("/peripherials_group/create")
    public String peripherialGroupCreatePost(@ModelAttribute PeripherialsGroup peripherialGroup,
                                      Model model) {
        model.addAttribute("peripherialGroup", peripherialGroup);
        vehicleService.createPeripherialsGroup(peripherialGroup);
        return "peripherials_group/create";
    }

    /******************************************************/

    @GetMapping("/peripherials_type")
    public String peripherialTypeList(Model model) {
        model.addAttribute("peripherials_type", vehicleService.getAllPeripherialsType());
        return "peripherials_type/view";
    }

    @GetMapping("/peripherials_type/create")
    public String peripherialTypeCreate(Model model) {
        model.addAttribute("peripherialType", new PeripherialsType());
        return "peripherials_type/create";
    }

    @PostMapping("/peripherials_type/create")
    public String peripherialTypeCreatePost(@ModelAttribute PeripherialsType peripherialType,
                                             Model model) {
        model.addAttribute("peripherialType", peripherialType);
        vehicleService.createPeripherialType(peripherialType);
        return "peripherials_type/create";
    }

    /******************************************************/

    @GetMapping("/peripherial")
    public String peripherialList(Model model) {
        model.addAttribute("peripherials", vehicleService.getAllPeripherial());
        return "peripherials/view";
    }

    @GetMapping("/peripherial/create")
    public String peripherialCreate(Model model) {
        model.addAttribute("peripherial", new Peripherials());
        return "peripherials/create";
    }

    @PostMapping("/peripherial/create")
    public String peripherialCreatePost(@ModelAttribute Peripherials peripherial,
                                            Model model) {
        model.addAttribute("peripherial", peripherial);
        vehicleService.createPeripherial(peripherial);
        return "peripherials/create";
    }

    /******************************************************/

    @GetMapping("/unit")
    public String unitList(Model model) {
        model.addAttribute("units", vehicleService.getAllUnit());
        return "unit/view";
    }

    @GetMapping("/unit/create")
    public String unitCreate(Model model) {
        model.addAttribute("unit", new Unit());
        return "unit/create";
    }

    @PostMapping("/unit/create")
    public String unitCreatePost(@ModelAttribute Unit unit,
                                        Model model) {
        model.addAttribute("unit", unit);
        vehicleService.createUnit(unit);
        return "unit/create";
    }

    /******************************************************/

    @GetMapping("/config")
    public String configList(Model model) {
        model.addAttribute("configs", vehicleService.getAllUnit());
        return "config/view";
    }

    @GetMapping("/config/create")
    public String configCreate(Model model) {
        model.addAttribute("config", new Config());
        return "config/create";
    }

    @PostMapping("/config/create")
    public String configCreatePost(@ModelAttribute Config config,
                                 Model model) {
        model.addAttribute("config", config);
        vehicleService.createConfig(config);
        return "config/create";
    }

    /******************************************************/

    @GetMapping("/simcard")
    public String simcardList(Model model) {
        model.addAttribute("simcards", vehicleService.getAllSimCard());
        return "simcard/view";
    }

    @GetMapping("/simcard/create")
    public String simcardCreate(Model model) {
        model.addAttribute("simcard", new SimCard());
        return "simcard/create";
    }

    @PostMapping("/simcard/create")
    public String simcardPost(@ModelAttribute SimCard simcard,
                                   Model model) {
        model.addAttribute("simcard", simcard);
        vehicleService.createSimCard(simcard);
        return "simcard/create";
    }
}
