package com.devwill.systemAscension.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_class")
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer minLevel;

    @OneToOne(mappedBy = "class")
    private UserClass users;

    @OneToMany(mappedBy = "class")
    private Set<ClassRequeriment> requirements = new HashSet<>();

    public Class(){
    }

    public Class(Long id, String name, Integer minLevel, UserClass users, Set<ClassRequeriment> requirements) {
        this.id = id;
        this.name = name;
        this.minLevel = minLevel;
        this.users = users;
        this.requirements = requirements;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(Integer minLevel) {
        this.minLevel = minLevel;
    }

    public UserClass getUsers() {
        return users;
    }

    public void setUsers(UserClass users) {
        this.users = users;
    }

    public Set<ClassRequeriment> getRequirements() {
        return requirements;
    }

    public void setRequirements(Set<ClassRequeriment> requirements) {
        this.requirements = requirements;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Class aClass)) return false;

        return id.equals(aClass.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
