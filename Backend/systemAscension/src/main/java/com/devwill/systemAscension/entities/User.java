package com.devwill.systemAscension.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="tb_user")
public class User {

    private Long id;
    private String name;
    private String email;
    private String password;
    private Integer level;
    private Integer currentXP;
    private Instant createdAt;

    @OneToMany(mappedBy = "user")
    private Set<UserAttribute> attributes = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<Friendship> friendships = new HashSet<>();

    @OneToMany(mappedBy = "user")
    private Set<UserMission> missions = new HashSet<>();

    @OneToOne(mappedBy = "user")
    private UserClass currentClass;

    public User(){

    }

    public User(Long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;

        this.level = 1;
        this.currentXP = 0 ;
        this.createdAt = Instant.now();
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLevel() {
        return level;
    }


    public Integer getCurrentXP() {
        return currentXP;
    }


    public Instant getCreatedAt() {
        return createdAt;
    }


    public Set<UserAttribute> getAttributes() {
        return attributes;
    }


    public Set<Friendship> getFriendships() {
        return friendships;
    }


    public Set<UserMission> getMissions() {
        return missions;
    }


    public UserClass getCurrentClass() {
        return currentClass;
    }

    //adicionar os métodos depois.


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;

        return id.equals(user.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
