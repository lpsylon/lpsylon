package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class LidoFlight4D {
    public void findFilght(Flight flight) throws RouteNotFoundException{
        Map<String,Boolean> availableAd = new HashMap<>();
        availableAd.put("Toronto",true);

        if(!availableAd.containsKey(flight.getArrivalAirport())){
            throw new RouteNotFoundException();
        }

    }
}
