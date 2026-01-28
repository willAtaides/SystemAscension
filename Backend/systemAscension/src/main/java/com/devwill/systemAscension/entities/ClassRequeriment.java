package com.devwill.systemAscension.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_class_requeriment")
public class ClassRequeriment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer minAttributeLevel;

    @ManyToOne
    @JoinColumn(name="class_id")
    private Class aClass;

    @ManyToOne
    @JoinColumn(name="attribute_id")
    private Attribute attribute;

    public ClassRequeriment(){}

    public ClassRequeriment(Long id, Integer minAttributeLevel, Class aClass, Attribute attribute) {
        this.id = id;
        this.minAttributeLevel = minAttributeLevel;
        this.aClass = aClass;
        this.attribute = attribute;
    }

    public Long getId() {
        return id;
    }

    public Integer getMinAttributeLevel() {
        return minAttributeLevel;
    }

    public void setMinAttributeLevel(Integer minAttributeLevel) {
        this.minAttributeLevel = minAttributeLevel;
    }

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
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
        if (!(o instanceof ClassRequeriment that)) return false;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
