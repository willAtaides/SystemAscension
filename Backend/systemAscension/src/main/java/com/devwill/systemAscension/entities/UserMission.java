package com.devwill.systemAscension.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_user_mission")
public class UserMission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.ORDINAL)
    private UserMissionStatus status;
    private Instant startedAt;
    private Instant completedAt;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="mission_id")
    private Mission mission;

    public UserMission (){

    }

    public UserMission(Long id, UserMissionStatus status, Instant startedAt, Instant completedAt, User user, Mission mission) {
        this.id = id;
        this.status = status;
        this.startedAt = startedAt;
        this.completedAt = completedAt;
        this.user = user;
        this.mission = mission;
    }

    public Long getId() {
        return id;
    }

    public UserMissionStatus getStatus() {
        return status;
    }


    public Instant getStartedAt() {
        return startedAt;
    }

    public Instant getCompletedAt() {
        return completedAt;
    }


    public User getUser() {
        return user;
    }


    public Mission getMission() {
        return mission;
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserMission that)) return false;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
