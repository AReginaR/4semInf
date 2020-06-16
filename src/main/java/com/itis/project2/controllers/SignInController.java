package com.itis.project2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SignInController {

    @GetMapping("/signIn")
    public String getSignIn(){
        return "signIn";
    }

}
