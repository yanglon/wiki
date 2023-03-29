package com.example.wiki.controller;

import com.example.wiki.domain.Ebook;
import com.example.wiki.req.EBookReq;
import com.example.wiki.resp.CommonResp;
import com.example.wiki.resp.EBookResp;
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
    public CommonResp list(EBookReq param){
        CommonResp<List<EBookResp>> commonResp = new CommonResp();
        List<EBookResp> list =  eBookService.select(param);
        commonResp.setContent(list);
        return commonResp;
    }
}
