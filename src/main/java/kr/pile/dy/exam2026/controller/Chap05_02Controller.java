package kr.pile.dy.exam2026.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Calendar;

@Controller
public class Chap05_02Controller {
    @GetMapping("/chap0502/{name}/{born}")
    public String requestMethod(@PathVariable("name") String name, @PathVariable("born") int born, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("born", born);

        // Calendar 방식(구식)
        Calendar calendar = Calendar.getInstance();
        int nowYear = calendar.get(Calendar.YEAR);
        int nowAge = nowYear - born;

        // 현대 많이 사용하는 방식
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - born + 1;

        model.addAttribute("age", age);
        model.addAttribute("nowAge", nowAge);
        return "viewPage05_02";
    }

}
