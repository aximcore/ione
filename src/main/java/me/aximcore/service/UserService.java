package me.aximcore.service;

import me.aximcore.model.company.Company;
import me.aximcore.model.user.*;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by aximc on 2017. 04. 10..
 */
// TODO
public interface UserService extends UserDetailsService {
    List<Users> getAllUsers();
    Users getUserbyEmail(String email);
    void createUser(String email, String firstName, String lastName, String password, String permission);
    void setFirstName(int userId, String firstName);
    void setLastName(int userId, String lastName);
    void setEmail(int userId, String email);
    void setPassword(int userId, String password);
    void setPermission(int userId, String permission);

}
