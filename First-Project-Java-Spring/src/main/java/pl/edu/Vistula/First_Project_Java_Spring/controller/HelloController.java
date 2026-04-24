package pl.edu.Vistula.First_Project_Java_Spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // PDF’teki ilk görev: @ResponseBody ile REST cevabı
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello Vistula! I am Sena, in my first Spring controller.";
    }

    // PDF’teki ikinci görev: greeting endpoint + RequestParam + Model
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name = "name", required = false, defaultValue = "World")
            String name,
            Model model
    ) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
