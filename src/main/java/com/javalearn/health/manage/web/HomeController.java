package com.javalearn.health.manage.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

/**
 * @author king-pan
 * @date 2019/11/11 10:15
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    @GetMapping("/loginPage")
    public ModelAndView loginPage() {
        ModelAndView view = new ModelAndView("login");
        view.addObject("date", LocalDate.now().getYear());
        return view;
    }
}
