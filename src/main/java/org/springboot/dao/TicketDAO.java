package org.springboot.dao;

import org.springboot.model.Ticket;
import java.util.List;

public interface TicketDAO {
    Ticket findById(Long id);
    List<Ticket> findAll();
    void save(Ticket ticket);
    void delete(Long id);
}