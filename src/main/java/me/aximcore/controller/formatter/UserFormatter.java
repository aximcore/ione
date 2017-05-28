package me.aximcore.controller.formatter;

import me.aximcore.model.user.Users;
import me.aximcore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import java.text.ParseException;
import java.util.Locale;

/**
 * Created by aximcore on 2017.05.28..
 */
public class UserFormatter implements Formatter<Users> {
    @Autowired
    private UserService userService;

    @Override
    public Users parse(String s, Locale locale) throws ParseException {
        return userService.getById(Integer.parseInt(s));
    }

    @Override
    public String print(Users users, Locale locale) {
        return null;
    }
}
