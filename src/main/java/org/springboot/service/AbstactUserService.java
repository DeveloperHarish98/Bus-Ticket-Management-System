package org.springboot.service;

import org.springboot.model.User;
import java.util.List;

public abstract class AbstactUserService {
    public abstract User findUserById(Long id);
    public abstract List<User> getAllUsers();
    public abstract void saveUser(User user);
    public abstract void deleteUser(Long id);
}
