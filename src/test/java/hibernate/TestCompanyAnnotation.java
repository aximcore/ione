package hibernate;

import me.aximcore.model.company.Company;
import me.aximcore.model.company.CompanyAdditionals;
import me.aximcore.model.company.Contact;
import me.aximcore.model.company.Headquarters;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by aximcore on 2017.05.30..
 */
public class TestAnnotation {

    private SessionFactory createSessionFactory() {
        Configuration configuration = new Configuration();
        configuration
                .addAnnotatedClass(Company.class)
                .addAnnotatedClass(CompanyAdditionals.class)
                .addAnnotatedClass(Headquarters.class)
                .addAnnotatedClass(Contact.class);
        configuration.setProperty("hibernate.dialect",
                "org.hibernate.dialect.H2Dialect");
        configuration.setProperty("hibernate.connection.driver_class",
                "org.h2.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:h2:mem");
        configuration.setProperty("hibernate.hbm2ddl.auto", "create");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }

}
