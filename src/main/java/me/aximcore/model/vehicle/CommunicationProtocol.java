package me.aximcore.model.vehicle;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by aximc on 2017. 04. 25..
 */
@Entity
@Table(name = "protocol")
public class CommunicationProtocol {
    @Id
    @GeneratedValue
    private int id;
    @NotNull
    private String name;

    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
