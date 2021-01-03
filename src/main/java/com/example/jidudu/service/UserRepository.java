package com.example.jidudu.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.jidudu.dbms.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
}
