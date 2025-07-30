package com.example.event_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/login")
    public String loginPage() {
        System.out.println("==> /login called");
        return "redirect:/login.html";
    }

    @GetMapping("/register")
    public String registerPage() {
        return "redirect:/register.html";
    }

    @GetMapping("/events")
    public String eventsPage() {
        return "redirect:/events.html";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }
}
