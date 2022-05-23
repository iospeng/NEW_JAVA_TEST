package main.java.FactoryPattern;

import sun.awt.windows.WPrinterJob;

import javax.swing.*;

public abstract class Computer {
    private String name;
    private double price;

    public abstract void start();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
