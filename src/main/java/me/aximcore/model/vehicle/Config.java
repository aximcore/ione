package me.aximcore.model.vehicle;

import javax.persistence.*;
import java.util.List;

/**
 * Created by aximc on 2017. 04. 27..
 *
 * Járműbe szerelt konfigurációja.
 */
@Entity
@Table(name = "config")
public class Config {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String description;
    private int price;
    @ManyToOne
    @JoinColumn(name = "unit")
    private Unit unit;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "config_assign", joinColumns = { @JoinColumn(name = "config_id", referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "peripherials_id", referencedColumnName = "id") })
    private List<Peripherials> peripherialsList;

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

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public List<Peripherials> getPeripherialsList() {
        return peripherialsList;
    }

    public void setPeripherialsList(List<Peripherials> peripherialsList) {
        this.peripherialsList = peripherialsList;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Config{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit=" + unit +
                ", peripherialsList=" + peripherialsList +
                ", peripherials_size=" + peripherialsList.size() +
                //", peripherialsList elso=" + peripherialsList.get(0).getName() +
                '}';
    }
}
