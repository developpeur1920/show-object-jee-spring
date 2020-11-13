package com.example.demo.controller;

import com.example.demo.entities.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping(value="")
    public String showobject(Model model){
        Person persn = new Person();
        persn.setAge("24");
        persn.setPrenom("hipo");
        persn.setNom("go");
        model.addAttribute("personsend",persn);
        return "index";
    }



}
