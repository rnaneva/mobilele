package com.example.mobilelele.domain.entities;

import com.example.mobilelele.domain.entities.enums.Engine;
import com.example.mobilelele.domain.entities.enums.Transmission;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Year;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity {

    @Column(columnDefinition = "TEXT")
    private String description;

    @Enumerated
    private Engine engine;

    @Column(name = "image-url")
    private String imageUrl;

    @Column
    private Integer mileage;

    private BigDecimal price;

    @Enumerated
    private Transmission transmission;

    @Column
    private Year year;

    @Column(name = "created-on")
    private LocalDateTime created;

    @Column(name = "modified-on")
    private LocalDateTime modified;

    @OneToOne
    private Model model;

    @OneToOne
    private User seller;


    public Offer() {
    }

    public String getDescription() {
        return description;
    }

    public Offer setDescription(String description) {
        this.description = description;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public Offer setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Offer setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public int getMileage() {
        return mileage;
    }

    public Offer setMileage(int mileage) {
        this.mileage = mileage;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Offer setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Offer setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public Year getYear() {
        return year;
    }

    public Offer setYear(Year year) {
        this.year = year;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public Offer setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public Offer setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }

    public Model getModel() {
        return model;
    }

    public Offer setModel(Model model) {
        this.model = model;
        return this;
    }

    public User getSeller() {
        return seller;
    }

    public Offer setSeller(User seller) {
        this.seller = seller;
        return this;
    }
}
