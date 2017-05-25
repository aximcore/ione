package me.aximcore.controller;

import me.aximcore.model.user.Users;
import me.aximcore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.util.matcher.RequestMatcherEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * Created by aximc on 2017. 04. 10..
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    private Authentication auth = SecurityContextHolder.getContext().getAuthentication();

    // el kell lőni login előtt egy fgv hogy loginolni tudja
    @RequestMapping(value = "/")
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/home")
    public String logged(@AuthenticationPrincipal Users user, Model model) {
        System.out.println(user.getEmail());
        model.addAttribute("user", user);
        return "tasks/view";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@AuthenticationPrincipal Users user, Model model){
        System.out.println(user.getEmail());
        model.addAttribute("user",user);
        return "tasks/view";
    }

    @RequestMapping(value = "/user/index")
    public String userIndexSite(Model model) {
        return "user/index";
    }

    @GetMapping(value = "/create/user")
    public String createUser(Model model) {
        model.addAttribute("users", new Users());
        return "user/create";
    }

    @PostMapping(value = "/create/user")
    public String createUserSubmit(@ModelAttribute Users users) {
        userService.createUser(users.getEmail(), users.getFirst_name(),
                users.getLast_name(), users.getPassword(), users.getPermission().name());
        return "user/create";
    }
}
