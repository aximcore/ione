package me.aximcore.dao.impl;

import me.aximcore.dao.UserTasksDao;
import me.aximcore.model.user.UserTasks;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by aximcore on 2017.05.24..
 */
@Component
@Transactional
public class UserTasksDaoImpl implements UserTasksDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<UserTasks> getAllTasks() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from UserTasks").list();
    }

    @Override
    public UserTasks getById(int taskId) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(UserTasks.class, taskId);
    }

    @Override
    public void createTask(UserTasks tasks) {
        Session session = sessionFactory.getCurrentSession();
        session.save(tasks);
    }

    @Override
    public void removeTask(int taskId) {
        Session session = sessionFactory.getCurrentSession();
        session.remove(getById(taskId));
    }


}
