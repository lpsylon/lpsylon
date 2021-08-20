package com.kodilla.stream.world;

import org.junit.jupiter.api.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {
        //Given
        List<Continent> continents = new ArrayList<>();
        List<Country> europeanCountries = new ArrayList<>();
        List<Country> asianCountries = new ArrayList<>();
        World world = new World();

        europeanCountries.add(new Country(new BigDecimal("100000"), "Poland"));
        europeanCountries.add(new Country(new BigDecimal("100000"), "Hungary"));
        europeanCountries.add(new Country(new BigDecimal("100000"), "Germany"));
        asianCountries.add(new Country(new BigDecimal("100000"), "Russia"));
        asianCountries.add(new Country(new BigDecimal("100000"), "China"));
        continents.add(new Continent("Europe", europeanCountries));
        continents.add(new Continent("Asia", asianCountries));
        world.addAllContinents(continents);

        //When
        BigDecimal worldPeopleQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal result = new BigDecimal("500000");
        Assertions.assertEquals(result, worldPeopleQuantity);
    }
}
