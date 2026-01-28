package com.devwill.systemAscension.entities;

import jakarta.persistence.*;

import java.time.Instant;
@Entity
@Table(name="tb_user_class")
public class UserClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant acquiredAt;

    @OneToOne
    @MapsId
    private User user;

    @OneToOne
    @MapsId
    private Class aClass;

    public UserClass(){}

    public UserClass(Instant acquiredAt, User user, Class aClass) {
        this.acquiredAt = acquiredAt;
        this.user = user;
        this.aClass = aClass;
    }

    public Instant getAcquiredAt() {
        return acquiredAt;
    }


    public User getUser() {
        return user;
    }


    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserClass userClass)) return false;

        return user.equals(userClass.user);
    }

    @Override
    public int hashCode() {
        return user.hashCode();
    }
}
