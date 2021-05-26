package com.ayt.springtransactions.service.impl;

import com.ayt.springtransactions.domain.Customer;
import com.ayt.springtransactions.repository.CustomerRepository;
import com.ayt.springtransactions.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public void saveCustomer(Customer customer) {

        if(customerRepository.findById(customer.getId() ) == null){
            throw  new RuntimeException("Customer Id already exist.");
        }
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(long id) {
        customerRepository.deleteById(id);
    }
}
