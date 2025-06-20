package com.microserviciologistic.listcustomer.repository;
import com.microserviciologistic.listcustomer.model.Customer;
import com.microserviciologistic.listcustomer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, UUID> {
    List<Customer> findAllByActiveTrue();

}