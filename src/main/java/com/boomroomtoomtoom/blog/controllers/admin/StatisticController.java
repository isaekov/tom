package com.boomroomtoomtoom.blog.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatisticController {


    @GetMapping(value = "/admin")
    public String statistic() {
        return "/admin/statistic";
    }
}
