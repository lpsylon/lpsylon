package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class HealthyShop implements Shop{
    String name = "HealthyShop";
    Basket basket=new Basket();
    @Override
    public void process(Product product){

        basket.products.add(product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthyShop that = (HealthyShop) o;
        return Objects.equals(basket, that.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basket);
    }

    @Override
    public String toString() {
        return name + " ";
    }
}
