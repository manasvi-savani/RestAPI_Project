package com.citi.training.Rest_API.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="transaction_table")


public class Transaction implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id") private int id;
    @Column(name="user_id") private int user_id;
    @Column(name="stock_id") private int stock_id;
    @Column(name="stock_name") private String stock_name;
    @Column(name="transaction_type") private String transaction_type;
    @Column(name="quantity") private int quantity;
    @Column(name="transaction_date") private String transaction_date;

    public Transaction() {
    }

    public Transaction(int id, int user_id, int stock_id, String stock_name, String transaction_type, int quantity, String transaction_date) {
        this.id = id;
        this.user_id = user_id;
        this.stock_id = stock_id;
        this.stock_name = stock_name;
        this.transaction_type = transaction_type;
        this.quantity = quantity;
        this.transaction_date = transaction_date;
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

    public int getStock_id() {
        return stock_id;
    }

    public void setStock_id(int stock_id) {
        this.stock_id = stock_id;
    }

    public String getStock_name() {
        return stock_name;
    }

    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(String transaction_date) {
        this.transaction_date = transaction_date;
    }
}
