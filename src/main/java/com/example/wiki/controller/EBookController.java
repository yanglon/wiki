package com.example.wiki.controller;

import com.example.wiki.domain.Ebook;
import com.example.wiki.resp.CommonResp;
import com.example.wiki.service.EBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EBookController {

    @Autowired
    private EBookService eBookService;

    @GetMapping("/list")
    public CommonResp<List<Ebook>> list(){
        CommonResp<List<Ebook>> commonResp = new CommonResp();
        List<Ebook> list =  eBookService.select();
        commonResp.setContent(list);
        return commonResp;
    }
}
