package service;

public class Bill {

    private Products products;

    public Bill(Products products) {
        this.products = products;
    }

    public Products getProducts() {
        return this.products;
    }

    public int getTotalPrice() {
        return products.getTotalPrice();
    }
}

