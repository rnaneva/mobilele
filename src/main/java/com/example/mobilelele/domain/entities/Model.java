package com.example.mobilelele.domain.entities;

import com.example.mobilelele.domain.entities.enums.Category;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;


import java.time.LocalDateTime;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {

    @Column(nullable = false)
    private String name;

    @Enumerated
    private Category category;

    @Size(min= 8, max = 512)
    @Column(name = "image-url")
    private String imageUrl;

    @Column(name = "start-year")
    private Integer startYear;

    @Column(name = "end-year")
    private String endYear;

    @Column(name = "crated-on")
    private LocalDateTime created;

    @Column(name = "modified-on")
    private LocalDateTime modified;

    @ManyToOne
    private Brand brand;

    public Model(){}

    public String getName() {
        return name;
    }

    public Model setName(String name) {
        this.name = name;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Model setCategory(Category category) {
        this.category = category;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Model setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public Model setStartYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }

    public String getEndYear() {
        return endYear;
    }

    public Model setEndYear(String endYear) {
        this.endYear = endYear;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Model setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public Model setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public Brand getBrand() {
        return brand;
    }

    public Model setBrand(Brand brand) {
        this.brand = brand;
        return this;
    }
}
