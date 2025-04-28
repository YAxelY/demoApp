package com.example.demoApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StaticPageController {

    @GetMapping("/")
    public String showStaticPage() {
        return "forward:/index.html"; // Redirige vers le fichier HTML statique
    }
}