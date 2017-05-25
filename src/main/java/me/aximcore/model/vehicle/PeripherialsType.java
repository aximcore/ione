package me.aximcore.model.vehicle;

import javax.persistence.*;

/**
 * Created by aximc on 2017. 04. 25..
 *
 * Periféria konkrét típusa, pl XY gyártó szondája.
 */
@Entity
@Table(name = "peripherials_type")
public class PeripherialsType {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    @ManyToOne
    @JoinColumn(name = "peripherials_group")
    private PeripherialsGroup peripherialsGroup;

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

    public PeripherialsGroup getPeripherialsGroup() {
        return peripherialsGroup;
    }

    public void setPeripherialsGroup(PeripherialsGroup peripherialsGroup) {
        this.peripherialsGroup = peripherialsGroup;
    }
}
