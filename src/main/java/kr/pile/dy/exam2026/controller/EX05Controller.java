package kr.pile.dy.exam2026.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/home")    //method 생략
public class EX05Controller {
    @GetMapping(value = "ex05")
    public String requestMethod() {
        return "view05";
    }
}
