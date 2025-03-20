package org.springboot.service;

import org.springboot.dao.UserDAO;
import org.springboot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstactUserService {
    @Autowired
    private UserDAO userDAO;

    @Override
    public User findUserById(Long id) {
        return userDAO.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @Override
    public void saveUser(User user) {
        userDAO.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDAO.delete(id);
    }
}