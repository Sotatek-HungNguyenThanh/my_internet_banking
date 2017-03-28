package com.beepig.Controller;

import com.beepig.Models.Test;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hungnguyen on 20/03/2017.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/available")
    @ResponseBody
    public String available() {
        return "Spring in Action";
    }

    @RequestMapping(value = "/checked-out", method= RequestMethod.GET, produces = "application/json")
    public @ResponseBody Object checkedOut() {
        return new Test(1, "hung");
    }

    @RequestMapping(value = "/test")
    public String test(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "test/index";
    }

    @RequestMapping(value = "/socket")
    public String socket() {
        return "test/socket";
    }
}
