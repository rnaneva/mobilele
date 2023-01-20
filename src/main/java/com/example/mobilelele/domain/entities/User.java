package com.example.mobilelele.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String username;

    @Column
    private String password;

    @Column(name = "first-name")
    private String firstName;

    @Column(name = "last-name")
    private String lastName;

    @Column(name = "is-active")
    private Boolean isActive;

    @OneToOne
    private UserRole role;

    @Column(name = "image-url")
    private String imageUrl;

    @Column(name = "created-on")
    private LocalDateTime created;

    @Column(name = "modified-on")
    private LocalDateTime modified;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Boolean getActive() {
        return isActive;
    }

    public User setActive(Boolean active) {
        isActive = active;
        return this;
    }

    public UserRole getRole() {
        return role;
    }

    public User setRole(UserRole role) {
        this.role = role;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public User setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public User setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public User setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }
}
