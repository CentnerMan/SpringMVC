package ru.vlsv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.vlsv.models.Student;

@Controller
public class MainController {
    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }
//    public String showHomePage() {
//        return "products-form";
//    }

//    @GetMapping("/info")
//    public String showInfoPage(Model model) {
//        String msg = "Java";
//        Student bob = new Student();
//        bob.setFirstName("Bob");
//
//        model.addAttribute("message123", msg);
//        model.addAttribute("student", bob);
//
//        return "info";
//    }
}
