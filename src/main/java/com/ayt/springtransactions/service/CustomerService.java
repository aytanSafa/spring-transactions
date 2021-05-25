package com.ayt.springtransactions.service;

import com.ayt.springtransactions.domain.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    void saveCustomer(Customer customer);
    void deleteCustomer(long id);
}
