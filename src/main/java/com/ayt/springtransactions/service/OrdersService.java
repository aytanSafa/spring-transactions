package com.ayt.springtransactions.service;

import com.ayt.springtransactions.domain.Orders;
import org.springframework.stereotype.Service;

@Service
public interface OrdersService {
    void saveOrders(Orders orders);
    void deleteOrders(long id);
}
