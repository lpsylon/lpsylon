package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public Client client;
    public boolean isOrdered;

    public OrderDto(final Client client, final boolean isOrdered){
        this.client = client;
        this.isOrdered = isOrdered;
    }
    public Client getClient(){
        return client;
    }
    public boolean isOrdered(){ return isOrdered;
    }
}
