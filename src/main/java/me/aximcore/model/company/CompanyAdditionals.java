package me.aximcore.model.company;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by aximcore on 2017.05.07..
 *
 * Plusz felületi elemek amik akár plusz költséggel járnak havonta.
 */
@Entity
@Table(name = "company_additionals")
public class CompanyAdditionals {
    @Id
    @GeneratedValue
    private int id;
    @NotEmpty
    private String name;
    @NotNull
    private int price;

    private String comment;

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
}
