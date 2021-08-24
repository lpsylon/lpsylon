package com.kodilla.good.patterns.challenges.shopProvider;

public class ShopProvider {

    private final String shopName;

    public ShopProvider(OrderRequest orderRequest) {
        this.shopName = orderRequest.getShopName();
    }

    public Shop create() {
        if (this.shopName.equals("Gluten Free Shop")) {
            return new GlutenFreeShop();
        } else {
            return new HealthyShop();
        }
    }

    @Override
    public String toString() {
        return shopName;
    }
}
