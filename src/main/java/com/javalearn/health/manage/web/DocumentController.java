package com.javalearn.health.manage.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author king-pan
 * @date 2019/11/12 1:20
 */
@RestController
@RequestMapping("/document")
public class DocumentController {


    @GetMapping("/old")
    public ModelAndView oldPage() {
        return new ModelAndView("document/old");
    }
    @GetMapping("/basic")
    public ModelAndView basicPage() {
        return new ModelAndView("document/basic");
    }
    @GetMapping("/life")
    public ModelAndView lifePage() {
        return new ModelAndView("document/life");
    }
    @GetMapping("/health")
    public ModelAndView healthPage() {
        return new ModelAndView("document/health");
    }
}
