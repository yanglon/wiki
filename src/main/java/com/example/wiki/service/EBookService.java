package com.example.wiki.service;

import com.example.wiki.domain.Ebook;
import com.example.wiki.domain.EbookExample;
import com.example.wiki.domain.Test;
import com.example.wiki.mapper.EbookMapper;
import com.example.wiki.mapper.TestMapper;
import com.example.wiki.req.EBookReq;
import com.example.wiki.resp.EBookResp;
import com.example.wiki.util.CopyUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EBookService {
        @Autowired
        private EbookMapper ebookMapper;

        public List<EBookResp> select(EBookReq param){
            EbookExample ebookExample = new EbookExample();
            final EbookExample.Criteria criteria = ebookExample.createCriteria();
            criteria.andNameLike("%" + param.getName() + "%");
            List<Ebook> users = ebookMapper.selectByExample(ebookExample);
            final List<EBookResp> eBookResps = CopyUtil.copyList(users, EBookResp.class);
            return eBookResps;
        };
}
