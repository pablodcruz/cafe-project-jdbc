package com.revature.repoOrdao;

import com.revature.models.MenuItem;

import java.util.List;


public interface MenuItemsDAO {


    //CRUD - to provide amn abstracted method of interacting with the database for the rest of our application!

    //CREATE
    public boolean insertMenuItem(MenuItem m);

    //READ
    public List<MenuItem> selectAllMenuItems();
    public MenuItem selectMenuItemByName(String name);
    public List<MenuItem> selectMenuItemsByCalories(double minCalories, double maxCalories );


    //UPDATE
    public MenuItem updateMenuItem(MenuItem m);


    //DELETE
    public MenuItem deleteMenuItem(MenuItem m);


}
