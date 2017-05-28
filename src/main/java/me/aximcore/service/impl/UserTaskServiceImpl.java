package me.aximcore.service.impl;

import me.aximcore.model.company.Company;
import me.aximcore.model.user.UserTaskPiority;
import me.aximcore.model.user.UserTaskType;
import me.aximcore.model.user.UserTasks;
import me.aximcore.model.user.Users;
import me.aximcore.service.UserTaskService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by aximcore on 2017.05.25..
 */
@Service
public class UserTaskServiceImpl implements UserTaskService {
    @Override
    public List<UserTasks> getByEmail(String email) {
        return null;
    }

    @Override
    public List<UserTasks> getByUser(Users user) {
        return null;
    }

    @Override
    public List<UserTasks> getByCompany(Company company) {
        return null;
    }

    @Override
    public void create(UserTasks task) {
        System.out.println(task);
    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public void setType(UserTaskType taskType) {

    }

    @Override
    public void setPiority(UserTaskPiority piority) {

    }

    @Override
    public void setStartDate(LocalDateTime startDate) {

    }

    @Override
    public void setEndData(LocalDateTime endData) {

    }

    @Override
    public void setCompany(Company company) {

    }

    @Override
    public void setUser(Users user) {

    }
}
