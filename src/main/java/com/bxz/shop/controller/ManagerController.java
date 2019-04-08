package com.bxz.shop.controller;

import com.bxz.shop.entity.Manager;
import com.bxz.shop.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/manager")
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public Manager index(@RequestParam String manager){
        return managerService.findByManager(manager);
    }

}
