package me.aximcore.controller;

import me.aximcore.model.user.Users;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * Created by aximcore on 2017.05.28..
 */
public class LoggedUserHead {
    protected Users user;

    @ModelAttribute("user")
    protected Users loggedUser(@AuthenticationPrincipal Users user) {
        this.user = user;
        return this.user;
    }
}
