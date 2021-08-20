package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Continent> continents = new ArrayList<>();

    public void addAllContinents(List<Continent>continent) {
        this.continents=continent;
    }

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getAllPeople)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
