package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(Client client, LocalDateTime when, Basket basket) {
        System.out.println("Order added to repository");;
        return true;
    }
}
