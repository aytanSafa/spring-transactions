package com.ayt.springtransactions.service;

import com.ayt.springtransactions.domain.Customer;

public interface CustomerService {
    void saveCustomer(Customer customer);
    void deleteCustomer(long id);
}
