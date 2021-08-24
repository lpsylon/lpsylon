package com.kodilla.good.patterns.challenges.flight;

import java.util.*;
import java.util.stream.Collectors;

public class FlightsConnections {

    public static String getDeparture() {
        return new Scanner(System.in).next();
    }
    public static String getArrival() {
        return new Scanner(System.in).next();
    }
    public static String getInterConnection() {
        return new Scanner(System.in).next();
    }


    public static void findDeparture() {
        System.out.println("Insert departure city");
        String departure = getDeparture();
        Flights.getFlightsList().stream()
                .filter(n -> n.getFrom().equals(departure))
                .forEach(System.out::println);
    }

    public static void findArrival() {
        System.out.println("Insert arrival city");
        String arrival = getArrival();
        Flights.getFlightsList().stream()
                .filter(n -> n.getTo().equals(arrival))
                .forEach(System.out::println);
    }

    public static void findInterConnection() {

        System.out.println("Insert inter connection city");
        String interConnection= getInterConnection();

        Flights.getFlightsList().stream()
                .filter(n->n.getFrom().equals(interConnection)|n.getTo().equals(interConnection))
                .forEach(System.out::println);

    }
}
