package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    private final BigDecimal allPeople;
    private final String name;

    public Country(final BigDecimal allPeople, final String name) {
        this.allPeople = allPeople;
        this.name = name;
    }

    public BigDecimal getAllPeople() {
        return allPeople;
    }
}
