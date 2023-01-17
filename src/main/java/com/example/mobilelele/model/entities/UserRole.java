package com.example.mobilelele.model.entities;

import com.example.mobilelele.model.entities.enums.Role;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name= "roles")
public class UserRole extends BaseEntity{


    @Enumerated()
    private Role name;
}
