package com.example.feigncustomer10001.service.impl;

import com.example.feigncustomer10001.bean.TbUser;
import com.example.feigncustomer10001.mapper.TbUserMapper;
import com.example.feigncustomer10001.service.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TbUserServiceImpl implements TbUserService {

    @Autowired
    private TbUserMapper tbUserMapper;

    @Override
    public List<TbUser> findAll() {
        return tbUserMapper.findAll();
    }
}
