package com.boomroomtoomtoom.blog.controllers.admin;

import com.boomroomtoomtoom.blog.entity.User;
import com.boomroomtoomtoom.blog.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AuthController {

    private final UserRepository usersRepository;

    private final PasswordEncoder passwordEncoder;

    public AuthController(UserRepository usersRepository, PasswordEncoder passwordEncoder) {
        this.usersRepository = usersRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @GetMapping("/register")
    public String showForm(Model m){
        m.addAttribute("user", new User());
        return "admin/register";
    }

    @GetMapping("/registers")
    public String showForm(@Valid User user, Errors validation, Model model){

        String username = user.getUsername();
        System.out.println(username);
        User existingUsername = usersRepository.findByUsername(username);

        if(existingUsername != null){
            validation.rejectValue("username", "user.username", "Duplicated username " + username);
        }

        if (!user.getPassword().equals(user.getConfirmPassword())) {
            validation.rejectValue("confirm", "Пароли не совпадают");
        }

        if (validation.hasErrors()) {
            model.addAttribute("errors", validation);
            model.addAttribute("user", user);
            return "admin/register";
        }
        return "admin/register";
    }
}
