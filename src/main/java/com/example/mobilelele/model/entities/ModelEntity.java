package com.example.mobilelele.model.entities;

import com.example.mobilelele.model.entities.enums.CategoryEnum;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;


import java.time.LocalDateTime;

@Entity
@Table(name = "models")
public class ModelEntity extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    private CategoryEnum category;

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
    private BrandEntity brand;

    public ModelEntity(){}

    public String getName() {
        return name;
    }

    public ModelEntity setName(String name) {
        this.name = name;
        return this;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public ModelEntity setCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public ModelEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public ModelEntity setStartYear(Integer startYear) {
        this.startYear = startYear;
        return this;
    }

    public String getEndYear() {
        return endYear;
    }

    public ModelEntity setEndYear(String endYear) {
        this.endYear = endYear;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public ModelEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public ModelEntity setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public BrandEntity getBrand() {
        return brand;
    }

    public ModelEntity setBrand(BrandEntity brand) {
        this.brand = brand;
        return this;
    }
}
