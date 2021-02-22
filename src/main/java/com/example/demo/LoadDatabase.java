package com.example.demo;

import com.example.demo.constants.Status;
import com.example.demo.entities.Employee;
import com.example.demo.entities.Order;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.OrderRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {
        return args -> {
            log.info("Preloading " + employeeRepository.save(new Employee("Bilbo", "Baggins", "burglar")));
            log.info("Preloading " + employeeRepository.save(new Employee("Frodo", "Baggins", "thief")));

            log.info("Preloading " + orderRepository.save(new Order("The Ring", Status.IN_PROGRESS)));
            log.info("Preloading " + orderRepository.save(new Order("The Stone", Status.COMPLETED)));
          };
    }
    
}
