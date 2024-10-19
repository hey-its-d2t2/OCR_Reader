package com.OCR.Reader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {

    @GetMapping("/")
    public String showHomePage() {
        return "index";
    }
}
