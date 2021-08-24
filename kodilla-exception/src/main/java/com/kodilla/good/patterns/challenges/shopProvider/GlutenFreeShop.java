package com.kodilla.good.patterns.challenges.shopProvider;

public class GlutenFreeShop implements Shop {

    @Override
    public void process(OrderRequest orderRequest) {

        System.out.println("Hi! This is Gluten Free Shop acknowledging following order: " + orderRequest
                + " for " + orderRequest.getClient());
    }
}
