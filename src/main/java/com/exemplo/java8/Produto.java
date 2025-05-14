package com.exemplo.java8;

public class Produto {
    private final String name;
    private final String category;
    private final double price;

    public Produto(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
