package me.aximcore.service;

import me.aximcore.model.company.Company;

import java.util.List;

/**
 * Created by aximcore on 2017.05.28..
 */
public interface CompanyService {
    List<Company> getAll();
    Company get(int companyId);
    void create(Company company);
    void remove(int companyId);
}
