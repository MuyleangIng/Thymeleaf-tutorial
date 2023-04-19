package co.istad.thymeleaftesting.controller;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    String viewHome(){
        Faker faker = new Faker();
        faker.book();
        return "pages/index";

    }
}
