package com.example.purchaseproject.model;


public class purchase {
    private int id;
    private String product;
    private int price;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "purchase{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", price=" + price +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
