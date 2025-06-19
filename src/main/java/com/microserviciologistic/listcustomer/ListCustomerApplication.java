package com.microserviciologistic.listcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class ListCustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ListCustomerApplication.class, args);
    }
    @GetMapping("/")
    public String redirectToGraphiQL() {
        return "redirect:/graphiql?path=/graphql";
    }

}
