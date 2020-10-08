package com.boomroomtoomtoom.blog.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller(value = "/admin")
public class PostController {

    @GetMapping
    public String postList() {
        return null;
    }
    @GetMapping
    public String postListDraft() {
        return null;
    }
    @PostMapping
    public String create() {
        return null;
    }
    @GetMapping
    public String postById() {
        return null;
    }
    @PutMapping
    public String edit() {
        return null;
    }
    @DeleteMapping
    public String delete() {
        return null;
    }
    @PostMapping
    public String isDraft() {
        return null;
    }

}
