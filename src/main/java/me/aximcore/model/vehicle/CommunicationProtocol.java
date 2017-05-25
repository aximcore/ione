package me.aximcore.model.vehicle;

import javax.persistence.*;

/**
 * Created by aximc on 2017. 04. 25..
 */
@Entity
@Table(name = "protocol")
public class CommunicationProtocol {
    @Id
    @GeneratedValue
    private int id;
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
}
