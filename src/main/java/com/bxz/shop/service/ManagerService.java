package com.bxz.shop.service;

import com.bxz.shop.entity.Manager;
import com.bxz.shop.mapper.ManagerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    public Manager findByManager(String manager){
        return managerMapper.findByManager(manager);
    }

}
