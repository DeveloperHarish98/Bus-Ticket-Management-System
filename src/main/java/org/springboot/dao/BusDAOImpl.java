package org.springboot.dao;

import org.springboot.model.Bus;
import org.springboot.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BusDAOImpl implements BusDAO {
    @Autowired
    private BusRepository busRepository;

    @Override
    public Bus findById(Long id) {
        return busRepository.findById(id).orElse(null);
    }

    @Override
    public List<Bus> findAll() {
        return busRepository.findAll();
    }

    @Override
    public void save(Bus bus) {
        busRepository.save(bus);
    }

    @Override
    public void delete(Long id) {
        busRepository.deleteById(id);
    }
}