package com.tian.demo;

public class Computer {
    private double price;
    private String color;
    private String name;

    public double getPrice() { //get,set,tostring方法 alt+insert
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "computer{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
