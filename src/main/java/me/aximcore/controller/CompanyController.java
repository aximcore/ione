package me.aximcore.controller;

import me.aximcore.model.company.Company;
import me.aximcore.model.user.Users;
import me.aximcore.model.vehicle.Unit;
import me.aximcore.service.CompanyService;
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
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @GetMapping("/company/create")
    public String createCompany(@AuthenticationPrincipal Users user,
                                Model model) {
        model.addAttribute("user", user);
        model.addAttribute("company", new Company());
        return "company/create";
    }

    @PostMapping("/company/create")
    public String createCompanyPost(@AuthenticationPrincipal Users user,
                                    @ModelAttribute Company company,
                                    Model model) {
        model.addAttribute("user", user);
        model.addAttribute("company", company);

        companyService.create(company);
        return "company/create";
    }

    @GetMapping("/company")
    public String getAllCompany(@AuthenticationPrincipal Users user,
                                Model model) {
        model.addAttribute("user", user);
        model.addAttribute("companyAll", companyService.getAll());
        return "company/view";
    }
}
