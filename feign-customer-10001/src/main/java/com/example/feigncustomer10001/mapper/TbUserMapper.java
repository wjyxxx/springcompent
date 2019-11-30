package com.example.feigncustomer10001.mapper;

import com.example.feigncustomer10001.bean.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbUserMapper {

    public List<TbUser> findAll();

}
