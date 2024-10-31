package com.groupproject.bike_rental.entity;

import com.groupproject.bike_rental.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String email;

    private UserRole userRole;

    private String password;
}
