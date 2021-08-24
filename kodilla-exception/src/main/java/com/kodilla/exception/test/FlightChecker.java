package com.kodilla.exception.test;

import java.util.Map;

public class FlightChecker {
    public static void main(String[] args) {
        LidoFlight4D lidoFlight4D = new LidoFlight4D();
        Flight myFlight = new Flight("Warsaw", "Moscow");

        try {
            lidoFlight4D.findFilght(myFlight);
        } catch (RouteNotFoundException e) {
            System.out.println("аэропорта нет");
        }
        finally {
            System.out.println("dziekujemy za wybor naszych linii lotniczych");
        }
    }
}
