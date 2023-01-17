package com.example.mobilelele.model.entities;

import com.example.mobilelele.model.entities.enums.Category;
import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Table(name = "models")
public class Model extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
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

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getStartYear() {
        return startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
