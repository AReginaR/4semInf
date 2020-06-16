package com.itis.project2.controllers;

import com.itis.project2.dto.PasswordForm;
import com.itis.project2.dto.RegistrationDto;
import com.itis.project2.models.User;
import com.itis.project2.security.UserDetailsImpl;
import com.itis.project2.servise.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfileController {
    @Autowired
    private UserService userService;

    @GetMapping("/profile")
    public String getProfilePage(@AuthenticationPrincipal UserDetailsImpl userDetails, Model model){
        User user = userDetails.getUser();
        model.addAttribute("user", user);
        return "profile";
    }

    @GetMapping("/logout")
    public String logout(){
        return "redirect:/signIn";
    }

    @PostMapping("/profile")
    public String editProfile(RegistrationDto dto){
        userService.edit(dto);
        return "redirect:/profile";
    }

    @PostMapping("/pass")
    public String changePassword(PasswordForm passwordForm){
        userService.changePassword(passwordForm);
        return "redirect:/profile";
    }
}
