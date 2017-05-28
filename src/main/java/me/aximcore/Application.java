package me.aximcore;

import me.aximcore.beans.HibernateConfiguration;
import me.aximcore.beans.TemplateEngineConf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

/**
 * Created by aximc on 2017. 04. 10..
 */

@SpringBootApplication
//@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class, TemplateEngineConf.class})
@EnableTransactionManagement
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
