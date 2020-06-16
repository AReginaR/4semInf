package com.itis.project2.servise;

import com.itis.project2.dto.PasswordForm;
import com.itis.project2.dto.RegistrationDto;
import com.itis.project2.models.User;

public interface UserService {
    void save(User user);
    void delete(Integer id);
    void edit(RegistrationDto dto);
    User findById(Integer id);
    User findByEmail(String email);
    void changePassword(PasswordForm form);
}
