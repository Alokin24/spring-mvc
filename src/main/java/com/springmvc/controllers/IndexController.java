package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        // what view we what rendered
        // trazhi view shto se vika index (Ne mora da e index.html)
        return "index";
    }
}
