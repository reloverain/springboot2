package com.rain.sprintboot2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("cheese")
public class CheeseController {

    @RequestMapping(value = "")
    public String index(Model model) {
        List<String> cheeses = new ArrayList<>();
        cheeses.add("cheddar");
        cheeses.add("parmesan");
        cheeses.add("munster");

        model.addAttribute("cheeses", cheeses);
        model.addAttribute("title", "Cheese");
        model.addAttribute("message", "Hello World!");
        return "cheese/index";
    }
}
