package com.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexController {


    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("home")
    public String home(){

        logger.info("你好");
        return "home";
    }
}
