package com.devwill.systemAscension.entities;

import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

public class Mission {

    private Long id;
    private String name;
    private String description;
    private Boolean active;

    @OneToMany(mappedBy = "mission")
    private Set<UserMission> executions = new HashSet<>();

    @OneToMany(mappedBy = "mission")
    private Set<MissionReWard> rewards = new HashSet<>();

    public Mission (){}

    public Mission(Long id, String name, String description, Boolean active, Set<UserMission> executions, Set<MissionReWard> rewards) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.active = active;
        this.executions = executions;
        this.rewards = rewards;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Set<UserMission> getExecutions() {
        return executions;
    }

    public void setExecutions(Set<UserMission> executions) {
        this.executions = executions;
    }

    public Set<MissionReWard> getRewards() {
        return rewards;
    }

    public void setRewards(Set<MissionReWard> rewards) {
        this.rewards = rewards;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mission mission)) return false;

        return id.equals(mission.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
