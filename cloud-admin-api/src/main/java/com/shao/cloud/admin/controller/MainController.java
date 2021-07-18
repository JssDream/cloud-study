package com.shao.cloud.admin.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Js on 2021/7/18.
 **/
@RestController
public class MainController {

    @Autowired
    private EurekaClient client;
    @GetMapping("/client")
    public Object getClient(){
        List<InstanceInfo> instances = client.getInstancesByVipAddress("eureka-provider", false);
        return instances.get(0);
    }


}
