package com.devwill.systemAscension.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_mission_reward")
public class MissionReWard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer Value;

    @Enumerated(EnumType.ORDINAL)
    private MissionReWardType reWardType;

    @ManyToOne
    @JoinColumn(name="mission_id")
    private Mission mission;

    @ManyToOne
    @JoinColumn(name="attribute")
    private Attribute attribute;

    public MissionReWard () {

    }

    public MissionReWard(Long id, Integer value, MissionReWardType reWardType, Mission mission, Attribute attribute) {
        this.id = id;
        Value = value;
        this.reWardType = reWardType;
        this.mission = mission;
        this.attribute = attribute;
    }

    public Long getId() {
        return id;
    }

    public Integer getValue() {
        return Value;
    }

    public void setValue(Integer value) {
        Value = value;
    }

    public MissionReWardType getReWardType() {
        return reWardType;
    }

    public void setReWardType(MissionReWardType reWardType) {
        this.reWardType = reWardType;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
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
        if (!(o instanceof MissionReWard that)) return false;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
