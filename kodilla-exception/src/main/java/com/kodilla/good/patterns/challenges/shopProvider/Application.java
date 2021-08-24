package com.kodilla.good.patterns.challenges.shopProvider;

public class Application {
    public static void main(String[] args) {

        OrderRequest orderRequest = new OrderRequest();
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.execute(orderRequest);

    }
}
