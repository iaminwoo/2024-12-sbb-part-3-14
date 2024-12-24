package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "redirect:/question/list";
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello!";
    }
}