package org.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springboot.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {
    Bus findByDestination(String destination);
    Bus findByBusNumber(String busNumber);   
}