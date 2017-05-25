package me.aximcore.dao;

import me.aximcore.model.user.UserTasks;

import java.util.List;

/**
 * Created by aximcore on 2017.05.24..
 */
public interface UserTasksDao {
    List<UserTasks> getAllTasks();
    UserTasks getById(int taskId);
    void createTask(UserTasks tasks);
    void removeTask(int taskId);
}
