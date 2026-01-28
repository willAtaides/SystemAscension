package com.devwill.systemAscension.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_attribute")
public class Attribute {

    private Long id;
    private String name;

    @OneToMany(mappedBy = "attribute")
    private UserAttribute users;

    @OneToMany(mappedBy = "attributes")
    private ClassRequeriment requirements;

    public Attribute() {}

    public Attribute(Long id, String name, UserAttribute users, ClassRequeriment requirements) {
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

    public UserAttribute getUsers() {
        return users;
    }

    public void setUsers(UserAttribute users) {
        this.users = users;
    }

    public ClassRequeriment getRequirements() {
        return requirements;
    }

    public void setRequirements(ClassRequeriment requirements) {
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
