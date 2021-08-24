package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Basket {
    List<Product> products = new LinkedList<>();
    Map<Shop,List> orders = new HashMap<>();
}
