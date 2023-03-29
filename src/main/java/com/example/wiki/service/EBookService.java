package com.example.wiki.service;

import com.example.wiki.domain.Ebook;
import com.example.wiki.domain.Test;
import com.example.wiki.mapper.EbookMapper;
import com.example.wiki.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EBookService {
        @Autowired
        private EbookMapper ebookMapper;

        public List<Ebook> select(){
            List<Ebook> users = ebookMapper.selectByExample(null);
            return users;
        };


}
