package com.ayt.springtransactions.dto;

import com.ayt.springtransactions.domain.Customer;
import com.ayt.springtransactions.domain.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerOrdersDto {

    private Customer customer;
    private Orders orders;

}
