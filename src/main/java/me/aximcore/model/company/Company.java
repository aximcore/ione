package me.aximcore.model.company;

import me.aximcore.model.vehicle.Vehicle;

import javax.persistence.*;
import java.util.List;

/**
 * Created by aximcore on 2017.05.07..
 */
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String tax_number;

    private String registration_number;
    @Enumerated(EnumType.STRING)
    private CompanyInterface interface_;

    private int price;

    private String comment;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "company_additionals_assign",
                   joinColumns = { @JoinColumn(name = "company_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "additionals_id", referencedColumnName = "id") })
    private List<CompanyAdditionals> companyAdditionals;
    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @JoinTable(name = "company_vehicle_assign")
    private List<Vehicle> vehicles;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "company_contacts_assign")
    private List<Contact> contacts;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "company_headquarters_assign")
    private List<Headquarters> headquarters;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTax_number() {
        return tax_number;
    }

    public void setTax_number(String tax_number) {
        this.tax_number = tax_number;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public CompanyInterface getInterface_() {
        return interface_;
    }

    public void setInterface_(CompanyInterface interface_) {
        this.interface_ = interface_;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<CompanyAdditionals> getCompanyAdditionals() {
        return companyAdditionals;
    }

    public void setCompanyAdditionals(List<CompanyAdditionals> companyAdditionals) {
        this.companyAdditionals = companyAdditionals;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Headquarters> getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(List<Headquarters> headquarters) {
        this.headquarters = headquarters;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
}
