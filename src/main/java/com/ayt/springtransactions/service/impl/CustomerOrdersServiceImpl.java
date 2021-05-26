package com.ayt.springtransactions.service.impl;

import com.ayt.springtransactions.domain.Customer;
import com.ayt.springtransactions.domain.Orders;
import com.ayt.springtransactions.dto.CustomerOrdersDto;
import com.ayt.springtransactions.service.CustomerOrdersService;
import com.ayt.springtransactions.service.CustomerService;
import com.ayt.springtransactions.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomerOrdersServiceImpl implements CustomerOrdersService {

    private final CustomerService customerService;
    private final OrdersService ordersService;

    @Autowired
    public CustomerOrdersServiceImpl(CustomerService customerService, OrdersService ordersService) {
        this.customerService = customerService;
        this.ordersService = ordersService;
    }


    @Override
    public void saveCustomerAndOrder(CustomerOrdersDto customerOrdersDto) {

        customerService.saveCustomer(customerOrdersDto.getCustomer());

        ordersService.saveOrders(customerOrdersDto.getOrders());

    }

    @Override
    public void deleteCustomerAndOrder(Long customerId, Long ordersId) {

        customerService.deleteCustomer(customerId);

        ordersService.deleteOrders(ordersId);

    }
}
