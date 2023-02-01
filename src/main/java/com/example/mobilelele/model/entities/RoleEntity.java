package com.example.mobilelele.model.entities;

import com.example.mobilelele.model.entities.enums.RoleEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;


@Entity
@Table(name= "roles")
public class RoleEntity extends BaseEntity{


    @Enumerated(EnumType.STRING)
    private RoleEnum name;

    public RoleEntity() {
    }

    public RoleEnum getName() {
        return name;
    }

    public RoleEntity setName(RoleEnum name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "RoleEntity{" +
                "name=" + name +
                '}';
    }
}
