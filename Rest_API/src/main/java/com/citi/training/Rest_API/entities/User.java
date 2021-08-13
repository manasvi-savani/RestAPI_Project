package com.citi.training.Rest_API.entities;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="users_table")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id") private int id;

    @Column(name="Name") private String name;
    @Column(name="Cash_value") private String cash_value;
    @Column(name="Investment_value") private String investment_value;
    @Column(name="Net_worth") private String net_worth;

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

    public String getCash_value() {
        return cash_value;
    }

    public void setCash_value(String cash_value) {
        this.cash_value = cash_value;
    }

    public String getInvestment_value() {
        return investment_value;
    }

    public void setInvestment_value(String investment_value) {
        this.investment_value = investment_value;
    }

    public String getNet_worth() {
        return net_worth;
    }

    public void setNet_worth(String net_worth) {
        this.net_worth = net_worth;
    }
}
