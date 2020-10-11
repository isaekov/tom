package com.boomroomtoomtoom.blog.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller("adminPost")
@RequestMapping("/admin")
public class PostController {

    @GetMapping(value = "/posts")
    public String postList(Model model) {
        String[] posts = {
                "Africa", "Antarctica"
        };
        model.addAttribute("posts", posts);

        return "admin/post-list";
    }

    @GetMapping(value = "/drafts")
    public String postListDraft() {
        return "admin/draft-list";
    }

    @GetMapping("/create")
    public String create() {
        return "admin/create";
    }

    @PostMapping("/create")
    public String create(Model model) {
        return "admin/create";
    }

    @GetMapping(value = "/{id}")
    public String postById(@PathVariable String id) {
        return null;
    }
    @GetMapping(value = "/edit/{id}")
    public String postEditById(@PathVariable String id) {
        return "admin/create";
    }
    @PutMapping(value = "/{id}")
    public String edit(@PathVariable String id) {
        return "admin/update";
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
