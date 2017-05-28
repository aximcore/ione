package me.aximcore.dao;

import me.aximcore.model.user.UserTasks;
import me.aximcore.model.user.Users;

import java.util.List;

/**
 * Created by aximcore on 2017.05.24..
 */
public interface UserTasksDao {
    List<UserTasks> getAllTasks();
    List<UserTasks> getByUser(Users user);
    UserTasks getById(int taskId);
    void createTask(UserTasks tasks);
    void removeTask(int taskId);
}
