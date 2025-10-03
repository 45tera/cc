package com.example.cc_backend.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("name", "tethra");
        return "index.html";
    }

    @GetMapping("/home")
    public String getHome() {
        return "index.html";
    }
}