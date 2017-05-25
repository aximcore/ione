package me.aximcore.model.vehicle;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by aximc on 2017. 04. 26..
 *
 * Egy konkrét egység.
 */
@Entity
@Table(name = "unit")
public class Unit {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "type")
    private UnitType unitType;

    private long imei;

    private long unit_id;

    private long serialnumber;
    @ManyToOne
    @JoinColumn(name = "protocol")
    private CommunicationProtocol protocol;
    @Column(columnDefinition="TIMESTAMP")
    private LocalDateTime import_time;

    private long sim;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UnitType getUnitType() {
        return unitType;
    }

    public void setUnitType(UnitType unitType) {
        this.unitType = unitType;
    }

    public long getImei() {
        return imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }

    public long getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(long unit_id) {
        this.unit_id = unit_id;
    }

    public long getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(long serialnumber) {
        this.serialnumber = serialnumber;
    }

    public CommunicationProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(CommunicationProtocol protocol) {
        this.protocol = protocol;
    }

    public LocalDateTime getImport_time() {
        return import_time;
    }

    public void setImport_time(LocalDateTime import_time) {
        this.import_time = import_time;
    }

    public long getSim() {
        return sim;
    }

    public void setSim(long sim) {
        this.sim = sim;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", unitType=" + unitType.getName() +
                ", imei=" + imei +
                ", unit_id=" + unit_id +
                ", serialnumber=" + serialnumber +
                ", protocol=" + protocol.getDescription() +
                ", import_time=" + import_time +
                ", sim=" + sim +
                '}';
    }
}
