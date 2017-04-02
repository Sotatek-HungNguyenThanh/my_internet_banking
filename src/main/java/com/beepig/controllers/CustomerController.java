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

    @RequestMapping(value = "/withdraw")
    public String showWithdrawPage() {
        return "customer/withdraw";
    }

    @RequestMapping(value = "/deposit")
    public String showDepositPage() {
        return "customer/deposit";
    }

    @RequestMapping(value = "/transfers")
    public String showTransfersPage() {
        return "customer/transfers";
    }

    @RequestMapping(value = "/search")
    public String showSearchPage() {
        return "customer/search";
    }
}
