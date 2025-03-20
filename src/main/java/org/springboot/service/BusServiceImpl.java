package org.springboot.service;

import org.springboot.dao.BusDAO;
import org.springboot.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl extends AbstractBusService {
    @Autowired
    private BusDAO busDAO;

    @Override
    public Bus findBusById(Long id) {
        return busDAO.findById(id);
    }

    @Override
    public List<Bus> getAllBuses() {
        return busDAO.findAll();
    }

    @Override
    public void saveBus(Bus bus) {
        busDAO.save(bus);
    }

    @Override
    public void deleteBus(Long id) {
        busDAO.delete(id);
    }
}