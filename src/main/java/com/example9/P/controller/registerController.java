package com.example9.P.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class registerController {
    @GetMapping("account/register")
    public String register(){
        return "account/register";
    }
}
