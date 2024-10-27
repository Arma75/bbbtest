package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InputController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/submit")
    public String submit(@RequestParam String inputText, Model model) {
    	if( "오채아".equals(inputText) ) {
            model.addAttribute("inputText", "jea / 색안경님");
    	} else if( "최다빈".equals(inputText) ) {
            model.addAttribute("inputText", "kevin");
    	} else if( "강대중".equals(inputText) ) {
            model.addAttribute("inputText", "river");
    	} else {
    		model.addAttribute("inputText", inputText);
    	}
        return "result";
    }
}