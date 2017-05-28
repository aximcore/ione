package me.aximcore.controller.formatter;

import me.aximcore.model.company.Company;
import me.aximcore.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by aximcore on 2017.05.28..
 */
public class CompanyFormatter implements Formatter<Company> {

    @Autowired
    CompanyService companyService;

    @Override
    public Company parse(String s, Locale locale) throws ParseException {
        return companyService.get(Integer.parseInt(s));
    }

    @Override
    public String print(Company company, Locale locale) {
        return null;
    }
}
