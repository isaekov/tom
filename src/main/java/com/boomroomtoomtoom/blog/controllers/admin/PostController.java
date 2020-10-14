package com.boomroomtoomtoom.blog.controllers.admin;

import com.boomroomtoomtoom.blog.entity.Category;
import com.boomroomtoomtoom.blog.entity.Post;
import com.boomroomtoomtoom.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller("adminPost")
@RequestMapping("/admin")
public class PostController {

    private PostRepository postRepository;

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
    public String create(@Valid Post post, Errors errors, Model model, @RequestParam("category") Category category) {
        post.setCategory(category);
        postRepository.save(post);
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
