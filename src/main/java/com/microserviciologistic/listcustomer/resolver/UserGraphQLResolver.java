package com.microserviciologistic.listcustomer.resolver;

import com.microserviciologistic.listcustomer.model.Customer;
import com.microserviciologistic.listcustomer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
public class UserGraphQLResolver {

    private final CustomerService customerService;

    @Autowired
    public UserGraphQLResolver(CustomerService customerService) {
        this.customerService = customerService;
    }

    @QueryMapping(name = "customers")
    public List<Customer> customers() {
        try {
            List<Customer> customers = customerService.getAllCustomers();

            if (customers.isEmpty()) {
                throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Found Customers");
            }

            return customers;

        } catch (ResponseStatusException e) {
            throw e;
        } catch (Exception e) {
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    "Error unexpected to recovering customers: " + e.getMessage(), e
            );
        }
    }
}