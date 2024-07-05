package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetyou(Model model){
        model.addAttribute("username", "태우");
        return "greetings";
    }
    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("username", "태우");
        return "goodbye";
    }
}
