package com.ayt.springtransactions.repository;

import com.ayt.springtransactions.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {

    Orders findByOrderDate(Date orderDate);

}
