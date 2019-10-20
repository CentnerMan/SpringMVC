package ru.vlsv;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * GeekBrains Java, Springshop.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 19.10.2019
 * @link https://github.com/Centnerman
 */

@Controller
public class WelcomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello World");
        return "index";
    }
}
