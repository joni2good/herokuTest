package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//Jonas er grim

@Controller
public class MovieController {

    @GetMapping("")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/1")
    public String getSide2(){
        return "side1";
    }
}
