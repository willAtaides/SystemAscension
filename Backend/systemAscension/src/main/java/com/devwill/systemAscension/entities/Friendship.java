package com.devwill.systemAscension.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_friendship")
public class Friendship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Enumerated(EnumType.ORDINAL)
    private FriendshipStatus status;

    private Instant createdAt;

    public Friendship(){

    }

    public Friendship(Long id, User user, FriendshipStatus status, Instant createdAt) {
        this.id = id;
        this.user = user;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }


    public User getUser() {
        return user;
    }


    public User getFriend() {
        return friend;
    }

    public FriendshipStatus getStatus() {
        return status;
    }

    public void setStatus(FriendshipStatus status) {
        this.status = status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Friendship that)) return false;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
