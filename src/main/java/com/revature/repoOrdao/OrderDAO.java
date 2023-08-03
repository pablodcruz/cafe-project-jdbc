package com.revature.repoOrdao;

import com.revature.models.Order;
import java.util.List;

public interface OrderDAO {

    // CRUD - don't need the update or delete functionality

    // CREATE
    public boolean insertOrder(Order o);


    // READ
    public List<Order> selectAllOrder();
}
