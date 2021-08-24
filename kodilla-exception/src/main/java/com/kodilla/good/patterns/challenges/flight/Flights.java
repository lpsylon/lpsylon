package com.kodilla.good.patterns.challenges.flight;

import java.util.*;

public class Flights {

    private final String from;
    private final String to;

    public Flights(final String from, final String to) {
        this.from = from;
        this.to = to;

    }

    public static List<Flights> getFlightsList() {
        final List<Flights> theList = new LinkedList<>();
        theList.add(new Flights("Warsaw", "Toronto"));
        theList.add(new Flights("Toronto", "Paris"));
        theList.add(new Flights("Warsaw", "London"));
        theList.add(new Flights("London", "Pekin"));
        theList.add(new Flights("Warsaw", "Moscow"));
        theList.add(new Flights("Moscow", "Warsaw"));
        theList.add(new Flights("Warsaw", "Pekin"));

        return new LinkedList<>(theList);
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(from, flights.from) && Objects.equals(to, flights.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
