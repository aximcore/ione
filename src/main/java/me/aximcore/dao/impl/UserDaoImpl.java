package me.aximcore.dao.impl;

import me.aximcore.dao.UserDao;
import me.aximcore.model.user.UserPermission;
import me.aximcore.model.user.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by aximc on 2017. 04. 10..
 */
@Component
@Transactional
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Users> getUsers() {
        Session session = sessionFactory.getCurrentSession();
        //session.beginTransaction();

        List result = session.createQuery("from Users").list();
        //session.getTransaction().commit();

        return result;
    }

    @Override
    public Users getById(int userId) {
        return sessionFactory.getCurrentSession().get(Users.class, userId);
    }

    @Override
    public void createUser(Users user) {
        Session session = sessionFactory.getCurrentSession();
        //session.beginTransaction();
        session.save(user);
        //session.getTransaction().commit();
    }

    @Override
    public Users getUserByEmail(String email) {
        return (Users) sessionFactory.getCurrentSession()
                .createQuery("from Users user where user.email=:email", Users.class)
                .setParameter("email", email)
                .uniqueResult();
    }

    @Override
    public List<String> getUserPermissions() {
        return Arrays.stream(UserPermission.class.getEnumConstants()).map(Enum::name).collect(Collectors.toList());
    }

    @Override
    public void setFirstName(int userId, String firstName) {
        Session session = sessionFactory.getCurrentSession();
        Users user = (Users) session.load(Users.class, userId);
        user.setFirst_name(firstName);
        //session.getTransaction().commit();
    }

    @Override
    public void setLastName(int userId, String lastName) {
        Session session = sessionFactory.getCurrentSession();
        Users user = (Users) session.load(Users.class, userId);
        user.setLast_name(lastName);
        //session.getTransaction().commit();
    }

    @Override
    public void setEmail(int userId, String email) {
        Session session = sessionFactory.getCurrentSession();
        Users user = (Users) session.load(Users.class, userId);
        user.setEmail(email);
        //session.getTransaction().commit();
    }

    @Override
    public void setPassword(int userId, String password) {
        Session session = sessionFactory.getCurrentSession();
        Users user = (Users) session.load(Users.class, userId);
        user.setPassword(password);
        //session.getTransaction().commit();
    }

    @Override
    public void setPermission(int userId, UserPermission permission) {
        Session session = sessionFactory.getCurrentSession();
        Users user = (Users) session.load(Users.class, userId);
        user.setPermission(permission);
        //session.getTransaction().commit();
    }


}
