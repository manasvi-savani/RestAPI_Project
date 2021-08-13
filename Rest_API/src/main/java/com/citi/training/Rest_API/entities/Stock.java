package com.citi.training.Rest_API.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "stocks_table")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") private Integer id;
    //@Column(name = "user_id") private Integer user_id;
    @Column(name = "stock_name")private String stock_name;
    @Column(name = "quantity")private Integer quantity;
    @Column(name = "sale_price")private Double sale_price;
    @Column(name = "current_price")private Double current_price;
    @Column(name = "open_price")private Double open_price;
    @Column(name = "close_price")private Double close_price;
    @Column(name = "cost")private Double cost;
    @Column(name = "market_value")private Double market_value;
    @Column(name = "totalGainLoss")private Double totalGainLoss;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStock_name() {
        return stock_name;
    }

    public void setStock_name(String stock_name) {
        this.stock_name = stock_name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quatity) {
        this.quantity = quatity;
    }

    public Double getSale_price() {
        return sale_price;
    }

    public void setSale_price(Double sale_price) {
        this.sale_price = sale_price;
    }

    public Double getCurrent_price() {
        return current_price;
    }

    public void setCurrent_price(Double current_price) {
        this.current_price = current_price;
    }

    public Double getOpen_price() {
        return open_price;
    }

    public void setOpen_price(Double open_price) {
        this.open_price = open_price;
    }

    public Double getClose_price() {
        return close_price;
    }

    public void setClose_price(Double close_price) {
        this.close_price = close_price;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getMarket_value() {
        return market_value;
    }

    public void setMarket_value(Double market_value) {
        this.market_value = market_value;
    }

    public Double getTotalGainLoss() {
        return totalGainLoss;
    }

    public void setTotalGainLoss(Double totalGainLoss) {
        this.totalGainLoss = totalGainLoss;
    }

    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    @JsonIgnore
    public User user;

    public User getUser(){
        return user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public Stock(){}

    public Stock(int id, String stock_name, int quantity, double sale_price,
                 double current_price, double open_price, double close_price,
                 double cost, double market_value, double totalGainLoss, User user){
        this.id = id;
        this.stock_name = stock_name;
        this.quantity = quantity;
        this.sale_price = sale_price;
        this.current_price = current_price;
        this.open_price = open_price;
        this.close_price = close_price;
        this.cost = cost;
        this.market_value = market_value;
        this.totalGainLoss = totalGainLoss;
        this.user = user;

    }
}
