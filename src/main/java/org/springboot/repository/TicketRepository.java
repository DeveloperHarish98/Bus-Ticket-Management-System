package org.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springboot.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Ticket findByBusId(Long busId);
    Ticket findByUserId(Long userId);
    Ticket findByBusIdAndUserId(Long busId, Long userId);
}