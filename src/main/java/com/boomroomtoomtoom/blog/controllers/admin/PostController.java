package com.boomroomtoomtoom.blog.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class PostController {

    @GetMapping(value = "/posts")
    public String postList() {
        return "admin/post-list";
    }

    @GetMapping(value = "/statistic")
    public String statistic() {
        return "/admin/statistic";
    }
    @GetMapping(value = "/drafts")
    public String postListDraft() {
        return null;
    }
    @PostMapping
    public String create() {
        return null;
    }
    @GetMapping(value = "/{id}")
    public String postById(@PathVariable String id) {
        return null;
    }
    @PutMapping(value = "/{id}")
    public String edit(@PathVariable String id) {
        return null;
    }
    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable String id) {
        return null;
    }
    @PutMapping(value = "is-draft/{id}")
    public String isDraft(@PathVariable String id) {
        return null;
    }

}
