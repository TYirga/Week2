package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class HomeController {

    @GetMapping("/resumeform")
    public String loadFormPage(Model model){
        model.addAttribute("resume", new Resume());
        return "resumeform";
    }

    @PostMapping("/resumeform")
    public String loadFromPage(@ModelAttribute Resume resume, Model model){
        model.addAttribute("resume", resume);
        return "resumec";}
       /*@PostMapping("/resumeform")
         public String loadFromPage(@Valid Resume resume, BindingResult result){
         if(result.hasErrors()){
        return "resumeform";
        }
         return "resumec:";
    }*/

}