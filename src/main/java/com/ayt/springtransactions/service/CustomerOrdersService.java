package com.ayt.springtransactions.service;


import com.ayt.springtransactions.dto.CustomerOrdersDto;


public interface CustomerOrdersService {

        void saveCustomerAndOrder(CustomerOrdersDto customerOrdersDto);
        void deleteCustomerAndOrder(Long customerId,Long ordersId);
}
