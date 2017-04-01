package com.beepig.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StaffController {
    @RequestMapping(value = "staff/home")
    public String showHomePage() {
        return "staff/home";
    }
}
