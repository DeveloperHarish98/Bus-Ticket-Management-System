package org.springboot.dao;

import org.springboot.model.User;
import java.util.List;

public interface UserDAO {
    User findById(Long id);
    List<User> findAll();
    void save(User user);
    void delete(Long id);
}