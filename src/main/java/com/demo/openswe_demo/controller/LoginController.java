package com.demo.openswe_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String home() {
        return "redirect:/login";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    /*
     * INTENTIONALLY WRONG
     * This is the bug OpenSWE will fix.
     */
    @PostMapping("/login")
    public String login(
            String username,
            String password) {

        return "redirect:/dashboard";
    }
}