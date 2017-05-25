package me.aximcore.service.impl;

import me.aximcore.dao.UserDao;
import me.aximcore.model.user.UserPermission;
import me.aximcore.model.user.Users;
import me.aximcore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by aximc on 2017. 04. 10..
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        //Users user = userDao.getUserByEmail(email);
        return userDao.getUserByEmail(email);
    }

    @Override
    public List<Users> getAllUsers() {
        return userDao.getUsers();
    }

    @Override
    public Users getUserbyEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    @Override
    public void createUser(String email, String firstName, String lastName, String password, String permission) {
        Users user = new Users();
        user.setEmail(email);
        user.setFirst_name(firstName);
        user.setLast_name(lastName);
        user.setPassword(passwordEncoder.encode(password));

        switch (permission){
            case "ADMIN":
                user.setPermission(UserPermission.ADMIN);
                break;
            case "SALES":
                user.setPermission(UserPermission.SALES);
                break;
            case "SALES_ADMIN":
                user.setPermission(UserPermission.SALES_ADMIN);
                break;
        }

        userDao.createUser(user);
    }

    @Override
    public void setFirstName(int userId, String firstName) {
        userDao.setFirstName(userId, firstName);
    }

    @Override
    public void setLastName(int userId, String lastName) {
        userDao.setLastName(userId, lastName);
    }

    @Override
    public void setEmail(int userId, String email) {
        userDao.setEmail(userId, email);
    }

    @Override
    public void setPassword(int userId, String password) {
        userDao.setPassword(userId, passwordEncoder.encode(password));
    }

    @Override
    public void setPermission(int userId, String permission) {

        switch (permission){
            case "ADMIN":
                userDao.setPermission(userId, UserPermission.ADMIN);
                break;
            case "SALES":
                userDao.setPermission(userId, UserPermission.SALES);
                break;
            case "SALES_ADMIN":
                userDao.setPermission(userId, UserPermission.SALES_ADMIN);
                break;
            default:
                System.err.println("Nem létező jogosultság!");
        }

    }
}
