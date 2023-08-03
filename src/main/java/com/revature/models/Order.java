package com.revature.models;

import com.revature.exceptions.BusinessException;

import java.util.ArrayList;
import java.util.List;

public class Order {

    /*
        This class is going to represent the total items ordered in an order.
     */
    List<MenuItem> orderItems = new ArrayList<MenuItem>();

    public Order(List<MenuItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Order(){
        this.orderItems = new ArrayList<>();
    }

    public List<MenuItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<MenuItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderItems=" + orderItems +
                '}';
    }
}
