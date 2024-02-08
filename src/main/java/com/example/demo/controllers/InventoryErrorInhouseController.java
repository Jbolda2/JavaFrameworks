package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InventoryErrorInhouseController {
    @GetMapping("/InventoryErrorInhouse")
    public String inventoryErrorInhouse(Model model) {
        return "InventoryErrorInhouse";
    }
}

