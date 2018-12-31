package com.tio.app.biz.controllers;

import com.tio.app.contents.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pcweb/mm-kk-pp")
public class MMKKController {
    @Autowired
    private TestService testService;

    @PostMapping("/tt")
    public String tt() {
        return "aaaa-bbb-ccc-ddd" + testService.test();
    }
}
