package com.itis.project2.servise;

import com.itis.project2.dto.PasswordForm;
import com.itis.project2.dto.RegistrationDto;
import com.itis.project2.models.User;
import com.itis.project2.repository.UserRepository;
import com.itis.project2.security.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
//        User userFromDb = userRepository.findUserByEmail(user.getEmail());
//
//        if (userFromDb != null) {
//            return false;
//        }
        userRepository.save(user);
//        return true;
    }

    @Override
    public void delete(Integer id) {
        if (userRepository.findById(id).isPresent()) {
            userRepository.deleteById(id);
        }
    }

    @Override
    public void edit(RegistrationDto dto) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userRepository.findUserByEmail(authentication.getName());
        if (user != null){
            user.setEmail(dto.getEmail());
            user.setName(dto.getName());
        }
        userRepository.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User findById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    @Override
    public void changePassword(PasswordForm form) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        User user = userDetails.getUser();
        if (passwordEncoder.matches(form.getOldPassword(), user.getPassword())) {
            user.setPassword(passwordEncoder.encode(form.getNewPassword()));
            userRepository.save(user);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
