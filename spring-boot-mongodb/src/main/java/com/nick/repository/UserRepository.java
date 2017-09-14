package com.nick.repository;

import com.nick.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by dreamcatchernick on 14/09/2017.
 */
@Repository
public class UserRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public User getUser(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        return mongoTemplate.findOne(query, User.class);
    }

    public List<User> getAll() {
        return mongoTemplate.findAll(User.class);
    }

    public void addUser(User user) {
        mongoTemplate.insert(user);
    }

    public void deleteUser(String id) {
        Query query = new Query(Criteria.where("id").is(id));
        mongoTemplate.remove(query, User.class);
    }

    public void updateUser(String id, User user) {
        mongoTemplate.save(user);
    }
}
