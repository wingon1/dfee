package com.example.jidudu.dbms;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idx;

    @Column(name="user_id")
    private String userId;

    @Column
    private String password;

    @Column
    private String name;
}
