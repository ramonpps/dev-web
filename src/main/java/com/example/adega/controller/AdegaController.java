package com.example.adega.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdegaController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/catalogo")
    public String catalogo() {
        return "catalogo";
    }

    @GetMapping("/sobre")
    public String sobre() {
        return "sobre";
    }

    @GetMapping("/contato")
    public String contato() {
        return "contato";
    }

    @GetMapping("/termos")
    public String termos() {
        return "termos";
    }

    @GetMapping("/privacidade")
    public String politica() {
        return "privacidade";
    }
}
