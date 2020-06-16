package com.itis.project2.servise;

import com.itis.project2.dto.RegistrationDto;

public interface RegistrationService {
    boolean registration(RegistrationDto registrationDto);
    boolean isUserExists(String email);
}
