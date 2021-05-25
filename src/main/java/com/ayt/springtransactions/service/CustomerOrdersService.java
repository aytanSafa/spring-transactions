package com.ayt.springtransactions.service;

import com.ayt.springtransactions.domain.Customer;
import com.ayt.springtransactions.domain.Orders;
import org.springframework.stereotype.Service;

@Service
public interface CustomerOrdersService {

        void saveCustomerAndOrder(Customer customer, Orders orders);
        void deleteCustomerAndOrder(Customer customer,Orders orders);
}
