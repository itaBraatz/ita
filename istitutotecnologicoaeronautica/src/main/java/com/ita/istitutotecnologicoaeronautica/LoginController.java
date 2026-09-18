package com.ita.istitutotecnologicoaeronautica;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
public String login(
        @RequestParam("username") String username,
        @RequestParam("password") String password) {

    System.out.println("Username: " + username);
    System.out.println("Password: " + password);

    if (username.equals("admin") && password.equals("123")) {
        return "inicio";
    }

    return "login";
}
}