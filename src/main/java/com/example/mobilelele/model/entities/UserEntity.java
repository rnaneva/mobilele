package com.example.mobilelele.model.entities;

import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

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

    @OneToMany
    private List<RoleEntity> roles;

    @Column(name = "image-url")
    private String imageUrl;

    @Column(name = "created-on")
    private LocalDateTime created;

    @Column(name = "modified-on")
    private LocalDateTime modified;

    public UserEntity() {
    }

    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Boolean getActive() {
        return isActive;
    }

    public UserEntity setActive(Boolean active) {
        isActive = active;
        return this;
    }

    public List<RoleEntity> getRole() {
        return roles;
    }

    public UserEntity setRole(RoleEntity role) {
        this.roles = roles;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public UserEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public UserEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public UserEntity setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }
}
