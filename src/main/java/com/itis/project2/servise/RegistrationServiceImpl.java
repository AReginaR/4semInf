package com.itis.project2.servise;

import com.itis.project2.dto.RegistrationDto;
import com.itis.project2.models.Role;
import com.itis.project2.models.User;
import com.itis.project2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public boolean registration(RegistrationDto registrationDto) {
        User userFromDB = userRepository.findUserByEmail(registrationDto.getEmail());

        if (userFromDB != null) {
            return false;
        }
        User user = User.builder()
                .email(registrationDto.getEmail())
                .name(registrationDto.getName())
                .password(passwordEncoder.encode(registrationDto.getPassword()))
                .role(Role.USER)
                .build();

        userRepository.save(user);
        return true;

    }

    @Override
    public boolean isUserExists(String email) {
        return userRepository.findUserByEmail(email) != null;
    }
}
