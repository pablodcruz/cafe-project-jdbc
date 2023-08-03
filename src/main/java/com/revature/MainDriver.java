package com.revature;

import com.revature.presentationOrController.CafePresentation;
import com.revature.repoOrdao.MenuItemDaoImpl;
import com.revature.repoOrdao.MenuItemsDAO;
import com.revature.repoOrdao.OrderDAO;
import com.revature.repoOrdao.OrderDaoImpl;
import com.revature.service.CafeService;

import java.util.logging.Logger;

public class MainDriver {

    /**
     *
     * Cafe Project
     *
     * 1. See a list of available foods
     *
     * 2. Create an order
     *
     * 3. See a list o previously created orders
     */


    /**
     *  With Log4j we get convinient features that makes logging easier.
     *  We can output both to the terminal, or to files (or even multiple files)
     *
     *  With Log4j, we also get different levels:
     *  ALL < Debug < Info < Warn < Error < Fatal < Off
     */

//    private static final Logger logger
//            = LoggerFactory.getLogger(MainDriver.class);
    public static void main(String[] args) {

        //Repo Layers being instantiatead - first verify that the dao layer works as intended!
        MenuItemsDAO mDao = new MenuItemDaoImpl();
        OrderDAO oDao = new OrderDaoImpl();


        //Instantiate our Service layer
        CafeService cafeService = new CafeService(mDao,oDao);


        //Instantiate our Presentation or Controller layer
        CafePresentation cafePresentation = new CafePresentation(cafeService);

        cafePresentation.startCafeMenu();







    }
}