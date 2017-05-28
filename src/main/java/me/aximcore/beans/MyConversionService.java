package me.aximcore.beans;

import me.aximcore.controller.formatter.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by aximcore on 2017.05.28..
 */
@Configuration
public class MyConversionService extends WebMvcConfigurerAdapter {

    @Override
    public void addFormatters(final FormatterRegistry registry) {
        super.addFormatters(registry);
        registry.addFormatter(companyFormatter());
        registry.addFormatter(userFormatter());
    }

    @Bean
    public CompanyFormatter companyFormatter() {
        return new CompanyFormatter();
    }

    @Bean
    public UserFormatter userFormatter() {
        return new UserFormatter();
    }

    @Bean
    public ConfigFormatter configFormatter() { return  new ConfigFormatter(); }

    @Bean
    public PeripherialsGroupFormatter peripherialsGroupFormatter() {return new PeripherialsGroupFormatter();}

    @Bean
    public PeripherialsTypeFormatter peripherialsTypeFormatter() { return  new PeripherialsTypeFormatter(); }

    @Bean
    public UnitTypeFormatter unitTypeFormatter() { return new UnitTypeFormatter(); }

}
