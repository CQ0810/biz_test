package com.tio.app.biz.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pcweb/mm-kk")
public class MMKKController {

    @PostMapping("/tt")
    public String tt() {
        return "aaaa";
    }
}
