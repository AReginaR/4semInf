package com.itis.project2.controllers;

import com.itis.project2.dto.SerialDto;
import com.itis.project2.models.Role;
import com.itis.project2.models.User;
import com.itis.project2.repository.SerialRepository;
import com.itis.project2.repository.UserRepository;
import com.itis.project2.servise.SerialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
@RequestScope
@RequestMapping("/admin")
@PreAuthorize("hasAnyAuthority('ADMIN')")
public class AdminController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SerialService serialService;

    @GetMapping
    public String userList(Model model){
        model.addAttribute("users", userRepository.findAll());
        return "admin";
    }

//    @GetMapping("{user}")
//    public String userEditForm(@PathVariable User user, Model model) {
//        model.addAttribute("user", user);
//        model.addAttribute("roles", Role.values());
//        return "userEdit";
//    }

    @PostMapping("/addSerial")
    public String addserial(SerialDto dto){
        serialService.save(dto);
        return "admin";
    }
}
