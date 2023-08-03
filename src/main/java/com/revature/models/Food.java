package com.revature.models;

public class Food extends MenuItem{

    public Food() {
    }

    public Food(String name, double price, double calories) {
        super(name, price, calories);
    }

    @Override
    public String toString() {
        return "Food{} " + super.toString();
    }
}
