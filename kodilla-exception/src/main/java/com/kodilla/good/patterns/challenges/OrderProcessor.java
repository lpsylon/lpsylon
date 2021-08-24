package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto execute(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getClient(), orderRequest.getWhen(), orderRequest.getBasket());
        if(isOrdered) {
            informationService.inform(orderRequest.getClient(), orderRequest.getBasket());
            orderRepository.createOrder(orderRequest.getClient(), orderRequest.getWhen(), orderRequest.getBasket());
            return new OrderDto(orderRequest.getClient(),true);
        }
        else{
            return new OrderDto(orderRequest.getClient(), false);
        }
    }
}
