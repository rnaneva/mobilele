package com.example.mobilelele.domain.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "brands")
public class Brand extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @Column(name = "modified-on")
    private LocalDateTime modified;


    public Brand(){}

    public String getName() {
        return name;
    }

    public Brand setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public Brand setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }
}
