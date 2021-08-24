package com.kodilla.good.patterns.challenges;

public class GlutenFreeShop implements Shop {
    String name="GlutenFreeShop";
    Basket basket=new Basket();
    @Override
    public void process(Product product){
        basket.products.add(product);
    }

    @Override
    public String toString() {
        return name = " ";
    }
}
