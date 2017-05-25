package me.aximcore.dao;

import me.aximcore.model.company.Company;
import me.aximcore.model.user.UserPermission;
import me.aximcore.model.user.Users;
import me.aximcore.model.user.UserTasks;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by aximc on 2017. 04. 10..
 */
public interface UserDao {
    List<Users> getUsers();
    Users getUserByEmail(String email);
    List<String> getUserPermissions();
    void createUser(Users user);
    void setFirstName(int userId, String firstName);
    void setLastName(int userId, String lastName);
    void setEmail(int userId, String email);
    void setPassword(int userId, String password);
    void setPermission(int userId, UserPermission permission);
}
