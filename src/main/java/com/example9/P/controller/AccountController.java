package com.example9.P.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("account/leftmain")
    public String main(){

        return "account/leftmain";
    }
    @GetMapping("account/notice")
    public String notice(){

        return "account/notice";
    }

    @GetMapping("account/login")
    public String login(){
        return "account/login";
    }

}
