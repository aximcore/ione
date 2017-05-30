package me.aximcore.model.company;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by aximcore on 2017.05.22..
 *
 * Cégek központjai.
 */
@Entity
@Table(name = "headquarters")
public class Headquarters {
    @Id
    @GeneratedValue
    private int id;
    /*@ManyToMany
    @JoinColumn(name = "company")
    private Company company;*/
    @NotEmpty
    private String address;
    @NotEmpty
    private String city;
    @NotEmpty
    private String zipCode;
    @NotEmpty
    private String countryISO;

    private double lat;

    private double lon;

    private boolean seat;

    private boolean visitingPlace;

    private String comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /*public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }*/

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountryISO() {
        return countryISO;
    }

    public void setCountryISO(String countryISO) {
        this.countryISO = countryISO;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public boolean isSeat() {
        return seat;
    }

    public void setSeat(boolean seat) {
        this.seat = seat;
    }

    public boolean isVisitingPlace() {
        return visitingPlace;
    }

    public void setVisitingPlace(boolean visitingPlace) {
        this.visitingPlace = visitingPlace;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
