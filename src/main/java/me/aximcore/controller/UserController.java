package me.aximcore.controller;

import me.aximcore.model.company.Company;
import me.aximcore.model.user.UserPermission;
import me.aximcore.model.user.UserTasks;
import me.aximcore.model.user.Users;
import me.aximcore.service.CompanyService;
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
    @Autowired
    private CompanyService companyService;

    private Users user;

    @ModelAttribute("user")
    private Users loggedUser(@AuthenticationPrincipal Users user) {
        this.user = user;
        return this.user;
    }

    // el kell lőni login előtt egy fgv hogy loginolni tudja
    @RequestMapping(value = "/")
    public String index(){
        return "login";
    }

    @RequestMapping(value = "/home")
    public String logged(Model model) {
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
                users.getLast_name(), users.getPassword(),
                users.getPermission().name());
        return "user/create";
    }


    /************************************************/

    @RequestMapping(value = "/user/task")
    public String userAllTask(Model model) {
        model.addAttribute("tasks", userTaskService.getByUser(user));
        return "tasks/view";
    }

    @GetMapping("/task/all")
    public String taskViewForAdmin(Model model) {
        model.addAttribute("tasks", userTaskService.getAll());
        return "tasks/admin/view";
    }

    @GetMapping("/task/create")
    public String createTaskGet(Model model) {
        model.addAttribute("task", new UserTasks());
        model.addAttribute("companyAll", companyService.getAll());
        return "tasks/create";
    }

    @PostMapping("/task/create")
    public String createTask(@ModelAttribute UserTasks task,
                             Model model) {
        model.addAttribute("task", task);
        model.addAttribute("companyAll", companyService.getAll());
        userTaskService.create(task);
        return "tasks/create";
    }

    @RequestMapping(value="/task/remove/{taskId}", method=RequestMethod.GET)
    public String removeTask(@PathVariable String taskId) {
        userTaskService.remove(Integer.parseInt(taskId));
        return "redirect:/user/task";
    }
}
