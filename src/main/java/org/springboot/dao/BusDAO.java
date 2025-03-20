// BusDAO.java
package org.springboot.dao;

import org.springboot.model.Bus;
import java.util.List;

public interface BusDAO {
    Bus findById(Long id);  
    List<Bus> findAll();
    void save(Bus bus);
    void delete(Long id);
}