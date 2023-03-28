package com.example.wiki.controller;

import com.example.wiki.domain.Test;
import com.example.wiki.mapper.TestMapper;
import com.example.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world222";
    }

    @RequestMapping("/select")
    public List<Test> select(){
        List<Test> user = testService.select();
        return user;
    }

}
