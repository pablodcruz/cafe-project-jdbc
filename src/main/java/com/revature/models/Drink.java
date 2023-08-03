package com.revature.models;

import java.util.Objects;

public class Drink extends MenuItem{


    public Drink() {
        this("Fake", -1, -1, false); //Constructor chaining, where we use the this()
    }

    public Drink(String name, double price, double calories, boolean isHot) {
        super(name, price, calories);
        this.isHot = isHot;
    }

    private boolean isHot;

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    @Override
    public String toString() {
        return "Drink {" +
                "name='" + this.getName() + '\'' +
                ", price=" + this.getPrice()+
                ", calories=" + this.getCalories()+
                ", is hot=" + this.isHot +
                '}';
    }
}
