package org.smile.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author liutao
 * @Date 2021/3/4 23:16
 * @Descript
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @RequestMapping("/index")
    public Object login(){
        return "Hello World -- Jenkins";
    }
}
