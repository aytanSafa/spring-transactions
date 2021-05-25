package com.ayt.springtransactions.service.impl;

import com.ayt.springtransactions.domain.Orders;
import com.ayt.springtransactions.repository.OrdersRepository;
import com.ayt.springtransactions.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrdersServiceImpl  implements OrdersService {

    private final OrdersRepository ordersRepository;

    @Autowired
    public OrdersServiceImpl(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }

    @Override
    public void saveOrders(Orders orders) {
        if(ordersRepository.findByOrderDate(orders.getOrderDate()) != null){
            throw new RuntimeException("You can give an order in a day");
        }
        }

    @Override
    public void deleteOrders(long id) {
        ordersRepository.deleteById(id);
    }
}
