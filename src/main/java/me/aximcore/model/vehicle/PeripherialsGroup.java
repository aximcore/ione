package me.aximcore.model.vehicle;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by aximc on 2017. 04. 25..
 *
 * Periféria csoportok, szondák, olvasók, hőmérők stb.
 */
@Entity
@Table(name = "peripherials_group")
public class PeripherialsGroup {

    @Id
    @GeneratedValue
    private int id;
    @NotEmpty
    private String name;

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
}
