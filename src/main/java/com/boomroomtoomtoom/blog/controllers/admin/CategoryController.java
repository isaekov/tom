package com.boomroomtoomtoom.blog.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/admin")
public class CategoryController {

    @GetMapping(value = "/category")
    public String index() {
        return "admin/category";
    }
    @PostMapping(value = "/category")
    public String create() {
        return "";
    }

}
