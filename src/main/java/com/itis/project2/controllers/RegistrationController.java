package com.itis.project2.controllers;

import com.itis.project2.dto.RegistrationDto;
import com.itis.project2.servise.RegistrationService;
import com.itis.project2.servise.UserService;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;


@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @GetMapping("/registration")
    public String getRegistration(Model model){
        model.addAttribute("userReg", new RegistrationDto());
        return "registration";
    }

    @PostMapping("/registration")
    public String registerUser(@ModelAttribute("userReg") @Valid RegistrationDto dto, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            return "registration";
        }
//        if (!dto.getPassword().equals(dto.getPasswordConfirm())){
//            model.addAttribute("passwordError", "Пароли не совпадают");
//            return "registration";
//        }
        if (!service.registration(dto)){
            model.addAttribute("emailError", "Пользователь с таким именем уже существует");
            return "registration";
        }

        return "redirect:/signIn";
    }

}
