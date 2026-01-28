package com.devwill.systemAscension.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_attribute")
public class Attribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "attribute")
    private Set<UserAttribute> users = new HashSet<>();

    @OneToMany(mappedBy = "attribute")
    private Set<ClassRequeriment> requirements = new HashSet<>();

    public Attribute() {}

    public Attribute(Long id, String name, Set<UserAttribute> users, Set<ClassRequeriment> requirements) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.requirements = requirements;
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

    public Set<UserAttribute> getUsers() {
        return users;
    }

    public void setUsers(Set<UserAttribute> users) {
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
        if (!(o instanceof Attribute attribute)) return false;

        return id.equals(attribute.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
