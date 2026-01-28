package com.devwill.systemAscension.entities;

import jakarta.persistence.*;

@Entity
@Table(name="tb_user_attribute")
public class UserAttribute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer level;
    private Integer currentXP;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;

    public UserAttribute(){}

    public UserAttribute(Integer level, Integer currentXP, User user, Attribute attribute) {
        this.level = level;
        this.currentXP = currentXP;
        this.user = user;
        this.attribute = attribute;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCurrentXP() {
        return currentXP;
    }

    public void setCurrentXP(Integer currentXP) {
        this.currentXP = currentXP;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserAttribute that)) return false;

        return user.equals(that.user);
    }

    @Override
    public int hashCode() {
        return user.hashCode();
    }
}
