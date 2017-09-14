package com.nick.service;

import com.nick.entity.User;
import com.nick.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dreamcatchernick on 14/09/2017.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public List<User> getAll() {
        return userRepository.getAll();
    }

    public User getUser(String id) {
        return userRepository.getUser(id);
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteUser(id);
    }

    public void updateUser(String id , User user){
        userRepository.updateUser(id, user);
    }
}
