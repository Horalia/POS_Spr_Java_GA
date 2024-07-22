package com.store.pos.model;

public class InventoryReturns {
    private double receipt;
    private double sku;
    private double sold;
    private double returned;

    public double getReceipt() {
        return receipt;
    }

    public void setReceipt(double receipt) {
        this.receipt = receipt;
    }

    public double getSku() {
        return sku;
    }

    public void setSku(double sku) {
        this.sku = sku;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public double getReturned() {
        return returned;
    }

    public void setReturned(double returned) {
        this.returned = returned;
    }
}
