package com.example.jidudu.dbms;

import javax.persistence.*;

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idx;

    @Column(name="user_id")
    private String userId;

    @Column(name="password")
    private String password;

    @Column(name="name")
    private String name;


    public User() {
    }

    public User(Long idx, String userId, String password, String name) {
        this.idx = idx;
        this.userId = userId;
        this.password = password;
        this.name = name;
    }

    public Long getIdx() {
        return this.idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User idx(Long idx) {
        this.idx = idx;
        return this;
    }

    public User userId(String userId) {
        this.userId = userId;
        return this;
    }

    public User password(String password) {
        this.password = password;
        return this;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " idx='" + getIdx() + "'" +
            ", userId='" + getUserId() + "'" +
            ", password='" + getPassword() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

    
}
