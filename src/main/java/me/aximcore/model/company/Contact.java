package me.aximcore.model.company;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by aximcore on 2017.05.22..
 *
 * Kapcsolattartók.
 */
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;
    @NotEmpty
    private String phoneNumber;
    @NotNull
    @Email
    private String email;
    @NotEmpty
    private String post;
    /*@ManyToOne
    @JoinColumn(name = "company")
    private Company company;*/

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    /*public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }*/
}
