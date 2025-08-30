package com.bero.basic.controller;


import com.bero.basic.service.BasicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/basic")
public class BasicController {
    private final BasicService basicService;

    public BasicController(BasicService basicService) {
        this.basicService = basicService;
    }

    @GetMapping
    @RequestMapping("/members")
    public List<String> getMemberList() {
        return basicService.getMemberList();
    }
}
