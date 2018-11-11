package com.example.boottodo.controller.sample;

import com.example.boottodo.dto.form.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    @GetMapping("hello")
    public ModelAndView index() {
        return new ModelAndView("sample/index");
    }

    @PostMapping("login")
    public ModelAndView login(LoginForm form) {
        //TODO Databaseにいれる
        return new ModelAndView("sample/complete", "loginForm", form);
    }

}
