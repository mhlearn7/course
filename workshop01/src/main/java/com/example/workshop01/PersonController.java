package com.example.workshop01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @GetMapping
    String getPeople(Model model){
        String finalDisplay = Person.decidingString();
        model.addAttribute("assignment", finalDisplay);
        return "index";
    }

}
