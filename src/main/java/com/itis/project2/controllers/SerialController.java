package com.itis.project2.controllers;

import com.itis.project2.models.Serial;
import com.itis.project2.servise.SerialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SerialController {

    @Autowired
    private SerialService serialService;

    @Autowired
    private ConversionService conversionService;

    @GetMapping("/serials")
    public String getSerialsPage(Model model){
        model.addAttribute("serials", serialService.getAll());
        return "serials";
    }

    @GetMapping("/serials/{id}")
    public String getSerialById(Model model, @PathVariable("id")Integer idSerial){
        Serial s = conversionService.convert(idSerial, Serial.class);
        model.addAttribute("serialsId", s);
        return "serial";
    }

//    @PostMapping(value = "/{id}", params = "watch")
//    public String getSerialById(Model model, @PathVariable("id")String idSerial){
//        Serial serial = conversionService.convert(idSerial, Serial.class);
//        model.addAttribute("serialId", serial);
//      //  userSerialService.save(serial, user, "watch");
//        return "serial";
//    }
//
//    @PostMapping(value = "/{id}", params = "remove")
//    public String getSerialById(Model model, @PathVariable("id")String idSerial){
//        Serial s = conversionService.convert(idSerial, Serial.class);
//        model.addAttribute("serialId", s);
//        return "serial";
//    }

}
