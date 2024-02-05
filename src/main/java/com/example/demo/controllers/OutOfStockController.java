package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

    @Controller
    public class OutOfStockController {
        @GetMapping("/outOfStock")
        public String outOfStock(Model model) {
            return "outOfStock";
        }
    }
