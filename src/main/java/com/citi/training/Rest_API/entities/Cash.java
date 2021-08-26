package com.citi.training.Rest_API.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="cash_table")
public class Cash implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id") private int id;
    @Column(name="user_id") private int user_id;
    @Column(name = "account") private String account;
    @Column(name = "value") private Double value;

    public Cash(){}

    public Cash(int id, int user_id, String account, double value){
        this.id = id;
        this.user_id = user_id;
        this.account = account;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
