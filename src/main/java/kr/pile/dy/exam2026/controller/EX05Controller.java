package kr.pile.dy.exam2026.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/home")    //method 생략
public class EX04Controller {
    @GetMapping
    public String requestMethod() {
        return "view05";
    }
}
