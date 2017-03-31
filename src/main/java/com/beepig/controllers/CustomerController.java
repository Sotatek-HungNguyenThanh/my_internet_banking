package com.beepig.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @RequestMapping(value = "/home")
    public String showHomePage() {
        return "customer/home";
    }

    @RequestMapping(value = "/login")
    public String showLoginPage() {
        return "customer/login";
    }

    @RequestMapping(value = "/account")
    public String showAccountPage() {
        return "customer/account";
    }

    @RequestMapping(value = "/search")
    public String showSearchPage() {
        return "customer/search";
    }

    @RequestMapping(value = "/transaction")
    public String showTransactionPage() {
        return "customer/transaction";
    }
}
