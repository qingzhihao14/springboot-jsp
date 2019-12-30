
package com.briup.springbootjsp.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {
    @GetMapping("/showIndex")
    public String showIndex(){
        return "index";
    }
}

