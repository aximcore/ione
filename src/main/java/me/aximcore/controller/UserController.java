package me.aximcore.controller;

import me.aximcore.model.user.UserTasks;
import me.aximcore.model.user.Users;
import me.aximcore.service.UserService;
import me.aximcore.service.UserTaskService;
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
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.List;
import java.util.Map;

/**
 * Created by aximc on 2017. 04. 10..
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserTaskService userTaskService;

    // el kell lőni login előtt egy fgv hogy loginolni tudja
    @RequestMapping(value = "/")
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/home")
    public String logged(@AuthenticationPrincipal Users user, Model model) {
        model.addAttribute("user", user);
        return "tasks/view";
    }

    @GetMapping(value = "/user/create")
    public String createUser(Model model) {
        model.addAttribute("users", new Users());
        return "user/create";
    }

    @PostMapping(value = "/user/create")
    public String createUserSubmit(@ModelAttribute Users users) {
        userService.createUser(users.getEmail(), users.getFirst_name(),
                users.getLast_name(), users.getPassword(), users.getPermission().name());
        return "user/create";
    }


    /************************************************/

    @RequestMapping(value = "/user/task")
    public String login(@AuthenticationPrincipal Users user, Model model){
        model.addAttribute("user",user);
        return "tasks/view";
    }

    @GetMapping("/task/create")
    public String createTaskGet(@AuthenticationPrincipal Users user, Model model) {
        model.addAttribute("user",user);
        model.addAttribute("task", new UserTasks());
        return "tasks/create";
    }

    @PostMapping("/task/create")
    public String createTask(@AuthenticationPrincipal Users user,
            @ModelAttribute UserTasks task,
                             Model model) {
        model.addAttribute("user",user);
        model.addAttribute("task", task);
        userTaskService.create(task);
        return "tasks/create";
    }

    @RequestMapping(value = "/user/index")
    public String userIndexSite(Model model) {
        return "user/index";
    }
}
