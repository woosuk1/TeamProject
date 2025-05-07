package com.example.teamproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DhfkdlsjController {

    @GetMapping("/dhfkdlsj")
    public @ResponseBody String dhfkdlsj() {
        return "Hello, Dhfkdlsj!";
    }

}
