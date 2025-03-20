package org.springboot.service;

import org.springboot.model.Ticket;
import java.util.List;

public abstract class AbstactTicketService {
    public abstract Ticket findTicketById(Long id);
    public abstract List<Ticket> getAllTickets();
    public abstract void saveTicket(Ticket ticket);
    public abstract void deleteTicket(Long id);
}
