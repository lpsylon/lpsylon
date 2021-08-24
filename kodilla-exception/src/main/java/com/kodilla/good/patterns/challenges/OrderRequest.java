package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private Client client;
    private LocalDateTime when;
    private Basket basket;

    public OrderRequest(Client client, LocalDateTime when, Basket basket) {
        this.client = client;
        this.when = when;
        this.basket = basket;
    }

    public Client getClient(){
        return client;
    }

    public LocalDateTime getWhen() {
        return when;
    }

    public Basket getBasket() {
        return basket;
    }
}
