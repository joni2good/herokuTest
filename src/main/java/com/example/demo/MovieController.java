package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovieController {

    @GetMapping("")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/side2")
    public String getSide2(){
        return "side2";
    }
}
