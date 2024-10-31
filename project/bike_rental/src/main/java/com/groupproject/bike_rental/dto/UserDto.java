package com.groupproject.bike_rental.dto;

import com.groupproject.bike_rental.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Data


public class UserDto {

    private Long id;

    private String name;

    private String email;

    private UserRole userRole;
}

