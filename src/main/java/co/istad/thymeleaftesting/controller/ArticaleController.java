package co.istad.thymeleaftesting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ArticaleController {
    @GetMapping("/article")
    String viewAritcle(){
        return "pages/article";
    }
}
