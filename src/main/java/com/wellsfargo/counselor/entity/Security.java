package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.Calendar;
import java.util.Date;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    private Portfolio portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private int quantity;

    protected Security() {

    }

    public Security(Portfolio portfolioId, String name, String category, long purchasePrice, Date purchaseDate, int quantity) {
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Portfolio getPortfolioId() { return portfolioId; }

    public void setPortfolioId(Portfolio portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getName() { return name; }

    public void setName(String name) {this.name = name;}

    public String getCategory() {return category;}

    public void setCategory(String category) { this.category = category;}
    
    public long getPurchasePrice() {return purchasePrice;}

    public void setPurchasePrice(long purchasePrice) { this.purchasePrice = purchasePrice;}

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }



}
