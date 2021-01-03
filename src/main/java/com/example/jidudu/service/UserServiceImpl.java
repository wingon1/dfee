package com.example.jidudu.service;

import java.util.List;
import java.util.Optional;

import com.example.jidudu.dbms.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository USER_REPOSITORY;

    @Override
    public Iterable<User> findAll() {
        return USER_REPOSITORY.findAll();
    }

    @Override
    public User save(User user) {
        return USER_REPOSITORY.save(user);
    }


    @Override
    public boolean delete(User user) {
        USER_REPOSITORY.delete(user);
        return true;
    }

    @Override
    public Optional<User> findById(Long idx) {
        return USER_REPOSITORY.findById(idx);
    }

}