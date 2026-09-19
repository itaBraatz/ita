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
        @RequestParam("password") String password,
        @RequestParam("year") String year,
        @RequestParam("matter") String matter) {

        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Year: " + year);
        System.out.println("Matter: " + matter);

    if (username.equals("admin") && password.equals("123")) {

        switch (matter) {

            case "Mathematics":

                if (year.equals("2026")) {
                    return "mathematics2026";
                }

                break;

            case "Physics":
                
                break;

            case "Chemistry":

                break;
        }
    }

    return "login";
    }
}