package org.springboot.service;

import org.springboot.dao.TicketDAO;
import org.springboot.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl extends AbstactTicketService {
    @Autowired
    private TicketDAO ticketDAO;

    @Override
    public Ticket findTicketById(Long id) {
        return ticketDAO.findById(id);
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketDAO.findAll();
    }

    @Override
    public void saveTicket(Ticket ticket) {
        ticketDAO.save(ticket);
    }

    @Override
    public void deleteTicket(Long id) {
        ticketDAO.delete(id);
    }
}