package com.nick.controller;

import com.nick.entity.User;
import com.nick.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dreamcatchernick on 14/09/2017.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET , value = "/users")
    public List<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping(method = RequestMethod.GET , value = "/users/{id}")
    public User getTopic(@PathVariable String id) {
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public void addTopic(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public void deleteTopic(@PathVariable String id) {
        userService.deleteUser(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public void updateTopic(@PathVariable String id , @RequestBody User user) {
        userService.updateUser(id, user);
    }
}
