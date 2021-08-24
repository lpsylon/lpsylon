package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;
import java.util.List;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        Client client = new Client("John", "Deere");

        LocalDateTime orderedWhen = LocalDateTime.of(2021, 8,20,12,0);

        Product wine = new Wine("Cammembert",100);
        Product chocolate = new Chocolate("Laderach",200);

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        glutenFreeShop.process(wine);
        List orders=glutenFreeShop.basket.products;

        Basket basket=new Basket();

        basket.orders.put(glutenFreeShop,orders);

        return new OrderRequest(client,orderedWhen,basket);
    }
}
