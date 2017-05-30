package hibernate;

import me.aximcore.beans.HibernateConfiguration;
import me.aximcore.dao.CompanyDao;
import me.aximcore.dao.impl.CompanyDaoImpl;
import me.aximcore.model.company.Company;
import me.aximcore.model.company.CompanyInterface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by aximcore on 2017.05.30..
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { HibernateConfiguration.class, CompanyDaoImpl.class, Company.class})
@Transactional
@Rollback
public class TestCompanyDAO {

    @Autowired
    private CompanyDao companyDao;

    @Before
    public void init() {
    }

    @After
    public void rollback() {
    }

    @Test
    public void daoCreateTest(){
        List<Company> companies = companyDao.getAll();
        Company t1 = new Company();
        Company t2 = new Company();

        t1.setInterface_(CompanyInterface.MINI);
        t2.setInterface_(CompanyInterface.NORMAL);

        t1.setTax_number("99999999");
        t2.setTax_number("8888888888");

        t1.setRegistration_number("846515");
        t2.setRegistration_number("626165165");

        t1.setName("ASd1 kft");
        t2.setName("ASd2 kft");

        companyDao.create(t1);
        companyDao.create(t2);

        assertEquals(companies.size(), companyDao.getAll().size() - 2);

        companyDao.remove(t1);
        companyDao.remove(t2);

        assertEquals(companies.size(), companyDao.getAll().size());
    }

    @Test
    public void daoRemoveTest() {
        Company t1 = new Company();
        t1.setInterface_(CompanyInterface.MINI);
        t1.setTax_number("99999999");
        t1.setRegistration_number("846515");
        t1.setName("ASd1 kft");

        companyDao.create(t1);
        Company c1 = companyDao.getById(t1.getId());

        assertEquals(t1.getName(), c1.getName());
        assertEquals(t1.getRegistration_number(), c1.getRegistration_number());

        companyDao.remove(t1);
        companyDao.remove(c1);
    }
}
