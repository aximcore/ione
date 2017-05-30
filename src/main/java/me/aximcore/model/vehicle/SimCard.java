package me.aximcore.model.vehicle;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

/**
 * Created by aximc on 2017. 04. 25..
 */
@Entity
@Table(name = "sim_card")
public class SimCard {
    @Id
    @GeneratedValue
    private int id;

    private boolean roaming;
    @NotEmpty
    private String provider;
    @NotEmpty
    private String apn;
    @NotEmpty
    private String phone_number;
    @NotEmpty
    private String data_call;
    @NotEmpty
    private String pin;
    @NotEmpty
    private String pin2;

    private boolean company_card;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isRoaming() {
        return roaming;
    }

    public void setRoaming(boolean roaming) {
        this.roaming = roaming;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getApn() {
        return apn;
    }

    public void setApn(String apn) {
        this.apn = apn;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getData_call() {
        return data_call;
    }

    public void setData_call(String data_call) {
        this.data_call = data_call;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin2() {
        return pin2;
    }

    public void setPin2(String pin2) {
        this.pin2 = pin2;
    }

    public boolean isCompany_card() {
        return company_card;
    }

    public void setCompany_card(boolean company_card) {
        this.company_card = company_card;
    }
}
