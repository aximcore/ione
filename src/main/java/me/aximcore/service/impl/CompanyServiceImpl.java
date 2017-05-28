package me.aximcore.service.impl;

import me.aximcore.dao.CompanyDao;
import me.aximcore.model.company.Company;
import me.aximcore.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by aximcore on 2017.05.28..
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDao companyDao;

    @Override
    public List<Company> getAll() {
        return companyDao.getAll();
    }

    @Override
    public Company get(int companyId) {
        return companyDao.getById(companyId);
    }

    @Override
    public void create(Company company) {
        companyDao.create(company);
    }

    @Override
    public void remove(int companyId) {
        System.out.println(companyId);
        //companyDao.remove(companyId);
    }
}
