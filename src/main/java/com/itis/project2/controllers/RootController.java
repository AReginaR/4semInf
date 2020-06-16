package com.itis.project2.controllers;

import com.itis.project2.models.User;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;

@Controller
public class RootController {

   // @PreAuthorize("isAuthenticated()")
    @GetMapping("/")
    public String getRootPage(Authentication authentication) {
        if (authentication != null) {
            return "redirect:/profile";
        } else {
            return "redirect:/signIn";
        }
    }


//    public String main(Model model, @AuthenticationPrincipal User user){
//        HashMap<Object, Object> data = new HashMap<>();
//
//        data.put("profile", user);
//        data.put("messages", null);
//
//        model.addAttribute("frontData", data);
//
//        return "signIn";
//    }
}

