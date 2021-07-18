package com.shao.cloud.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Js on 2021/7/18.
 **/
@RestController
public class MainController {

    @GetMapping("/hello")
    public String test(){
        return "Hello";
    }
}
