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
}
