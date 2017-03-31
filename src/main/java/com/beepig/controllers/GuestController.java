package com.beepig.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GuestController {
    @RequestMapping(value = "")
    public String getGuest() {
        return "guest";
    }
}
