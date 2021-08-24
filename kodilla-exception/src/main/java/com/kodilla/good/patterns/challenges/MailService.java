package com.kodilla.good.patterns.challenges;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MailService implements InformationService {
    @Override
    public void inform(Client client, Basket basket) {

        System.out.println(client);

        basket.orders.entrySet().stream()
                .forEach(System.out::println);

    }
}
