package kr.pile.dy.exam2026.controller;

import kr.pile.dy.exam2026.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class EX09Controller {
    @GetMapping("/member")
    public String requestForm() {

        return "signUp";
    }

    @PostMapping("/member")
    public String requestFormResult(/* @ModelAttribute */ Member member, Model model) {
        model.addAttribute("member", member); //생략 가능

        return "signUpResult";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
//        binder.setAllowedFields("id", "city", "hobby");
        binder.setDisallowedFields("passwd", "city");
    }

}
