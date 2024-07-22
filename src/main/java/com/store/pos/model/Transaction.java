package com.store.pos.model;

import java.sql.Date;
import java.time.LocalDate;

public class Transaction {
    private double receipt;
    private Date date;
    private double payment;
    private String method;

    public Transaction() {

    }

    public Transaction(double receipt, double payment, String method, Date date) {
        this.receipt = receipt;
        this.payment = payment;
        this.method = method;
        this.date = date;
    }

    public double getReceipt() {
        return receipt;
    }

    public void setReceipt(double receipt) {
        this.receipt = receipt;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}

