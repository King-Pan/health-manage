package com.javalearn.health.manage.web;

import com.javalearn.health.manage.entity.Aged;
import com.javalearn.health.manage.entity.dto.AgedDTO;
import com.javalearn.health.manage.service.AgedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author king-pan
 * @date 2019/12/2 23:07
 */
@RestController
@RequestMapping("/basic")
public class AgedController {

    @Autowired
    private AgedService agedService;

    @GetMapping("/page")
    public ModelAndView page() {
        return new ModelAndView("document/basic");
    }

    @GetMapping("/test")
    public String test() {
        return "Hello-Mock";
    }

    @GetMapping("/")
    public Object getPageList(@PageableDefault Pageable pageable, AgedDTO agedDTO) {
        return agedService.getPageList(agedDTO, pageable);
    }
}
