package com.revature.repoOrdao;

import com.revature.models.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MenuItemDaoImpl implements MenuItemsDAO {

    List<MenuItem> menuItems = new ArrayList<>();

    @Override
    public boolean insertMenuItem(MenuItem m) {

        return menuItems.add(m);
    }

    @Override
    public List<MenuItem> selectAllMenuItems() {
        return menuItems;
    }

    @Override
    public MenuItem selectMenuItemByName(String name) {

        MenuItem myItem = null;
        for(MenuItem m: menuItems){
            if(m.getName().toLowerCase().equals(name.toLowerCase())){
                myItem = m;
            }
        }
        return myItem;
    }

    @Override
    public List<MenuItem> selectMenuItemsByCalories(double minCalories, double maxCalories) {

        List<MenuItem> foodWithTheRightCalories = new ArrayList<>();
        for(MenuItem m: menuItems){
            if( m.getCalories() > minCalories && m.getCalories() <maxCalories){
                foodWithTheRightCalories.add(m);
            }
        }

        return foodWithTheRightCalories;
    }

    @Override
    public MenuItem updateMenuItem(MenuItem m) {
        return null;
    }

    @Override
    public MenuItem deleteMenuItem(MenuItem m) {
        return null;
    }
}
