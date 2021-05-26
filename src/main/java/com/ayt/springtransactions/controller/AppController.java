package com.ayt.springtransactions.controller;

import com.ayt.springtransactions.dto.CustomerOrdersDto;
import com.ayt.springtransactions.service.CustomerOrdersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AppController {

private final CustomerOrdersService service;

    public AppController(CustomerOrdersService service) {
        this.service = service;
    }

    @PostMapping(value = "/saveCustomerOrders")
    public ResponseEntity<String> saveCustomerAndOrders(@RequestBody CustomerOrdersDto customerOrdersDto){
        service.saveCustomerAndOrder(customerOrdersDto);
        return ResponseEntity.ok("Customer and Orders save operations are success.");
    }

    @DeleteMapping(value = "/deleteCustomerOrders")
    public ResponseEntity<String> deleteCustomerAndOrders(@RequestBody Long customerId,@RequestBody Long ordersId ){
        service.deleteCustomerAndOrder(customerId,ordersId);
        return ResponseEntity.ok("Customer and Orders save operations are success.");
    }

}


