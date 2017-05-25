package me.aximcore.model.vehicle;

import javax.persistence.*;

/**
 * Created by aximc on 2017. 04. 26..
 *
 * Egységek tipusai, pl teletonika 1000.
 */

@Entity
@Table(name = "unit_type")
public class UnitType {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
