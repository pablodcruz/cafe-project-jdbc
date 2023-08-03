package com.revature.repoOrdao;

import com.revature.models.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDAO{


    //Rather than a database with SQLite or PostgreSQL
    // I am just going to use a list!

    List<Order> orderItems = new ArrayList<>();

    @Override
    public boolean insertOrder(Order o) {
        return orderItems.add(o);
    }

    @Override
    public List<Order> selectAllOrder() {
        return orderItems;
    }
}
