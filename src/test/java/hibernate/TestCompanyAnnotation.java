package hibernate;

import me.aximcore.model.company.*;
import me.aximcore.model.vehicle.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by aximcore on 2017.05.30..
 */
public class TestCompanyAnnotation {

    private SessionFactory sessionFactory;
    private Session session;

    private SessionFactory createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration
                .addAnnotatedClass(Company.class)
                .addAnnotatedClass(CompanyAdditionals.class)
                .addAnnotatedClass(Headquarters.class)
                .addAnnotatedClass(Contact.class)
                .addAnnotatedClass(Vehicle.class)
                .addAnnotatedClass(CommunicationProtocol.class)
                .addAnnotatedClass(Config.class)
                .addAnnotatedClass(Peripherials.class)
                .addAnnotatedClass(PeripherialsType.class)
                .addAnnotatedClass(PeripherialsGroup.class)
                .addAnnotatedClass(SimCard.class)
                .addAnnotatedClass(Unit.class)
                .addAnnotatedClass(UnitType.class);
        configuration.setProperty("hibernate.dialect",
                "org.hibernate.dialect.H2Dialect");
        configuration.setProperty("hibernate.connection.driver_class",
                "org.h2.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:h2:./test");
        configuration.setProperty("hibernate.hbm2ddl.auto", "create");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }

    @Before
    public void init() {
        sessionFactory = createSessionFactory();
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
    }

    @Test
    public void company() {
        Company test1 = new Company();
        test1.setName("TEST1 KFT.");
        test1.setPrice(20000);
        test1.setRegistration_number("999999999999");
        test1.setTax_number("888888888888888888");
        test1.setInterface_(CompanyInterface.MINI);

        session.save(test1);


        Company test1S = (Company) session.createQuery("from Company where name=:name")
                .setParameter("name", test1.getName()).uniqueResult();

        assertNotNull(test1S);
        assertEquals(test1.getName(), test1S.getName());

        List<Company> companyList = session.createQuery("from Company") .list();

        assertEquals(1, companyList.size());
    }

}
