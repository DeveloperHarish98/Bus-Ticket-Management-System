package org.springboot.service;

import org.springboot.model.Bus;
import java.util.List;

public abstract class AbstractBusService {
    public abstract Bus findBusById(Long id);
    public abstract List<Bus> getAllBuses();
    public abstract void saveBus(Bus bus);
    public abstract void deleteBus(Long id);
}