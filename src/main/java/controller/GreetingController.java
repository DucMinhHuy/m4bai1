package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class GreetingController {
    @GetMapping("/")
    public String greeting(String tentao, Model model){
        model.addAttribute("name", tentao);
        return "index";
    }
}
