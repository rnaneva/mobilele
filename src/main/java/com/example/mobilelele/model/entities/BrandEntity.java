package com.example.mobilelele.model.entities;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "brands")
public class BrandEntity extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @Column(name = "created-on")
    private LocalDateTime created;


    @Column(name = "modified-on")
    private LocalDateTime modified;

    @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ModelEntity> models;


    public BrandEntity(){}

    public List<ModelEntity> getModels() {
        return models;
    }

    public BrandEntity setModels(List<ModelEntity> models) {
        this.models = models;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public BrandEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public String getName() {
        return name;
    }

    public BrandEntity setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public BrandEntity setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }
}
