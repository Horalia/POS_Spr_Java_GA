package com.store.pos.model;


public class Inventory {
    private double sku;
    private double available;
    private double cost;
    private String name;

    public Inventory() {
    }
    public Inventory(double sku, double available, double cost, String name) {
        this.sku = sku;
        this.available = available;
        this.cost = cost;

        this.name = name;
    }
    

    public double getSku() {
        return sku;
    }

    public void setSku(double sku) {
        this.sku = sku;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getAvailable() {
        return available;
    }

    public void setAvailable(double available) {
        this.available = available;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
