package com.example.mobilelele.domain.entities;

import com.example.mobilelele.domain.entities.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;


@Entity
@Table(name= "roles")
public class UserRole extends BaseEntity{


    @Enumerated
    private Role name;

    public UserRole() {
    }

    public Role getName() {
        return name;
    }

    public UserRole setName(Role name) {
        this.name = name;
        return this;
    }
}
