package com.tgt.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by a522467 on 11/16/16.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @RequestMapping("/hello")
    public String addItem()
    {
        return "hello ramu";
    }
}
