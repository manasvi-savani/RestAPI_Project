package com.citi.training.Rest_API.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="users_table")


public class User implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id") private int id;

    @Column(name="Name") private String name;
    @Column(name="Cash_value") private Double cash_value;
    @Column(name="Investment_value") private Double investment_value;
    @Column(name="Net_worth") private Double net_worth;

    public User() {
    }
    
    public User(int id, String name, double cash_value, double investment_value, double net_worth) {
        this.id = id;
        this.name = name;
        this.cash_value = cash_value;
        this.investment_value = investment_value;
        this.net_worth = net_worth;
    }

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

    public Double getCash_value() {
        return cash_value;
    }

    public void setCash_value(double cash_value) {
        this.cash_value = cash_value;
    }

    public double getInvestment_value() {
        return investment_value;
    }

    public void setInvestment_value(double investment_value) {
        this.investment_value = investment_value;
    }

    public double getNet_worth() {
        return net_worth;
    }

    public void setNet_worth(double net_worth) {
        this.net_worth = net_worth;
    }

    public void addStock(Stock s){
        s.setStock(this);
        stockNames.add(s);

    }
    // Adding relationships
    @JoinColumn(name="user_id", referencedColumnName="id")
    @OneToMany(cascade={CascadeType.MERGE, CascadeType.PERSIST})

    private List<Stock> stockNames = new ArrayList<Stock>();

    public List<Stock> getStockNames() {
        return stockNames;
    }

    public void setStockNames(List<Stock> stockNames) {
        this.stockNames = stockNames;
    }
}
