package com.kodilla.good.patterns.challenges.shopProvider;

public class OrderProcessor {

    public void execute(final OrderRequest orderRequest) {

        new ShopProvider(orderRequest).create().process(orderRequest);

    }
}
