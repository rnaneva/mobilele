package com.example.mobilelele.model.entities;

import com.example.mobilelele.model.entities.enums.Engine;
import com.example.mobilelele.model.entities.enums.Transmission;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;

@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity {



    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated
    private Engine engine;

    @Column(name = "image-url")
    private String imageUrl;

    @Column
    private Integer mileage;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Transmission transmission;

    @Column
    private Year year;

    @Column(name = "created-on")
    private LocalDateTime created;

    @Column(name = "modified-on")
    private LocalDateTime modified;

    @OneToOne
    private ModelEntity model;

    @OneToOne
    private UserEntity seller;


    public OfferEntity() {
    }


    public OfferEntity setMileage(Integer mileage) {
        this.mileage = mileage;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public OfferEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public OfferEntity setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OfferEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public OfferEntity setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public OfferEntity setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public OfferEntity setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public Year getYear() {
        return year;
    }

    public OfferEntity setYear(Year year) {
        this.year = year;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public OfferEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public OfferEntity setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public ModelEntity getModel() {
        return model;
    }

    public OfferEntity setModel(ModelEntity model) {
        this.model = model;
        return this;
    }

    public UserEntity getSeller() {
        return seller;
    }

    public OfferEntity setSeller(UserEntity seller) {
        this.seller = seller;
        return this;
    }
}
