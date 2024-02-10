package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
@Controller
public class PreviousPageController {
    @GetMapping("/previousPage")
    public String rateHandler(HttpServletRequest request){
        //your controller code
        String referer = request.getHeader("Referer");
        return "redirect:"+ referer;
    }
}
