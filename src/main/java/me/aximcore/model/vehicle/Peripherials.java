package me.aximcore.model.vehicle;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by aximc on 2017. 04. 26..
 *
 * Konkrét periféria.
 */
@Entity
@Table(name = "peripherials")
public class Peripherials {
    @Id
    @GeneratedValue
    private int id;
    @NotEmpty
    private String name;
    @NotNull
    private long serialnumber;

    private String Comment;
    @OneToOne
    @JoinColumn(name = "type")
    private PeripherialsType peripherialsType;

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

    public long getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(long serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public PeripherialsType getPeripherialsType() {
        return peripherialsType;
    }

    public void setPeripherialsType(PeripherialsType peripherialsType) {
        this.peripherialsType = peripherialsType;
    }
}
