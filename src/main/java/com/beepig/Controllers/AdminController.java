package com.beepig.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {
    @RequestMapping(value = "/admin")
    @ResponseBody
    public String admin() {
        return "Hello Admin";
    }
}
