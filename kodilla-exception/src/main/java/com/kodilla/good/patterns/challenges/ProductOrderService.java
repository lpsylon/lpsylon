package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    @Override
    public boolean order(Client client, LocalDateTime when, Basket basket) {
        System.out.println("Ordered "+when);
        return true;
    }
}
