package com.kodilla.good.patterns.challenges.shopProvider;


import java.util.Objects;

public class HealthyShop implements Shop {

    @Override
    public void process(OrderRequest orderRequest){
        System.out.println("Hello Healthy Shop");
    }
}
