package com.groupproject.bike_rental.services.auth;


import com.groupproject.bike_rental.dto.SignupRequest;
import com.groupproject.bike_rental.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);



}
