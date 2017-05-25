package me.aximcore.dao;

import me.aximcore.model.company.Company;
import me.aximcore.model.company.CompanyAdditionals;
import me.aximcore.model.company.Contact;
import me.aximcore.model.company.Headquarters;

import java.util.List;

/**
 * Created by aximcore on 2017.05.24..
 */
public interface CompanyDao {
    List<Company> getAll();
    Company getById(int companyId);
    Company getByName(String name);
    void create(Company company);
    void remove(Company company);
    // Company Additionals
    void createAdditional(CompanyAdditionals additional);
    void removeAdditional(CompanyAdditionals additional);
    // Contact
    void createContact(Contact contact);
    void removeContact(Contact contact);
    // Headquarters
    void createHeadquarter(Headquarters headquarter);
    void removeHeadquarter(Headquarters headquarter);
}
