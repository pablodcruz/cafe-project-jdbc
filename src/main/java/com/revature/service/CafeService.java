package com.revature.service;

import com.revature.exceptions.BusinessException;
import com.revature.models.MenuItem;
import com.revature.models.Order;
import com.revature.repoOrdao.MenuItemsDAO;
import com.revature.repoOrdao.OrderDAO;

import java.awt.*;
import java.util.List;

public class CafeService {

    private MenuItemsDAO mDao;
    private OrderDAO oDao;

    public CafeService(MenuItemsDAO mDao, OrderDAO oDao){
        this.mDao = mDao;
        this.oDao = oDao;
    }


    public Order addOrderItemToOrder(MenuItem m, Order o) throws BusinessException {


        //See if item already exists:
        List<MenuItem> itemsSoFar = o.getOrderItems();

        if(itemsSoFar.contains(m)){
            throw new BusinessException("Item already exists!");
        }else{
            itemsSoFar.add(m);
            o.setOrderItems(itemsSoFar);
        }
        return o;
    }


    public boolean createOrder(List<MenuItem> menuItems){

        Order o = new Order(menuItems);

        return oDao.insertOrder(o);
    }

    public double getTotalPrice(Order o){

        double total = 0;
        for(MenuItem m: o.getOrderItems()){

            total += m.getPrice();
        }
        return total;

    }

    public List<Order> getAllOrders(){
        return oDao.selectAllOrder();
    }

    public List<MenuItem> getAllFoodItems(){
        return mDao.selectAllMenuItems();
    }
}
