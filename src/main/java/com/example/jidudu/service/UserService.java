package com.example.jidudu.service;

import com.example.jidudu.dbms.User;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    
    Iterable<User> findAll();
    User save(User user);
    boolean delete(User user);
    Optional<User> findById(Long idx);

}
