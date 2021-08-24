package com.kodilla.good.patterns.challenges.shopProvider;

import java.util.LinkedList;
import java.util.List;

public class OrderRequest {

    private Client client = new Client("Adam", "Jensen");
    Product wine = new Wine("Kazbek Peak", 1000);
    Product chocolate = new Chocolate("Red Bar", 50);
    private String shopName = "Gluten Free Shop";
    // private String shopName = "HealthyShop";


    public Client getClient() {
        return client;
    }

    public String getShopName() {
        return shopName;
    }

    @Override
    public String toString() {
        List<Product> productList=new LinkedList<>();
        productList.add(wine);
        productList.add(chocolate);
        return  ""+productList;
    }
}
