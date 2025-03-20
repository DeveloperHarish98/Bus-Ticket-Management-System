package org.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusTicketManagementSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(BusTicketManagementSystemApplication.class, args);
        System.out.println("Bus Ticket Management System");
    }
}