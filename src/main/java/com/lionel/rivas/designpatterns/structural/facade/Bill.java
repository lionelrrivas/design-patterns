package com.lionel.rivas.designpatterns.structural.facade;

public class Bill {
    
    private int amount;
    
    public Bill(int amount) {
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
