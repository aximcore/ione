package me.aximcore.dao.impl;

import me.aximcore.dao.CompanyDao;
import me.aximcore.model.company.Company;
import me.aximcore.model.company.CompanyAdditionals;
import me.aximcore.model.company.Contact;
import me.aximcore.model.company.Headquarters;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by aximcore on 2017.05.24..
 */
@Component
@Transactional
public class CompanyDaoImpl implements CompanyDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Company> getAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Company").list();
    }

    @Override
    public Company getById(int companyId) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Company.class, companyId);
    }

    @Override
    public Company getByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        return (Company) session
                .createQuery("from Company where name=:name")
                .setParameter("name", name)
                .uniqueResult();
    }

    @Override
    public void create(Company company) {
        Session session = sessionFactory.getCurrentSession();
        session.save(company);
    }

    @Override
    public void remove(Company company) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(company);
    }

    @Override
    public void createAdditional(CompanyAdditionals additional) {
        Session session = sessionFactory.getCurrentSession();
        session.save(additional);
    }

    @Override
    public void removeAdditional(CompanyAdditionals additional) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(additional);
    }

    @Override
    public void createContact(Contact contact) {
        Session session = sessionFactory.getCurrentSession();
        session.save(contact);
    }

    @Override
    public void removeContact(Contact contact) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(contact);
    }

    @Override
    public void createHeadquarter(Headquarters headquarter) {
        Session session = sessionFactory.getCurrentSession();
        session.save(headquarter);
    }

    @Override
    public void removeHeadquarter(Headquarters headquarter) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(headquarter);
    }
}
