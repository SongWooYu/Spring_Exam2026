package kr.pile.dy.exam2026.controller;

import jakarta.validation.Valid;
import kr.pile.dy.exam2026.domain.Person;
import kr.pile.dy.exam2026.domain.PersonValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.lang.classfile.instruction.StackInstruction;

@Controller
@RequestMapping("/exam09_03")
public class Chp09_03Controller {
    @Autowired
    private PersonValidator personValidator;

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("person", new Person());
        return ("viewPage09_03");
    }

    @PostMapping
    public String submit(@Valid @ModelAttribute Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "viewPage09_03";
        return ("viewPage09_03_result");
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(personValidator);
    }
}
