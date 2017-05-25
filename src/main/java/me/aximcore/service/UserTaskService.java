package me.aximcore.service;

import me.aximcore.model.company.Company;
import me.aximcore.model.user.UserTaskPiority;
import me.aximcore.model.user.UserTaskType;
import me.aximcore.model.user.UserTasks;
import me.aximcore.model.user.Users;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by aximcore on 2017.05.23..
 */
public interface UserTaskService {
    List<UserTasks> getByEmail(String email);
    void create(UserTasks task);
    void setTitle(String title);
    void setDescription(String description);
    void setType(UserTaskType taskType);
    void setPiority(UserTaskPiority piority);
    void setStartDate(LocalDateTime startDate);
    void setEndData(LocalDateTime endData);
    void setCompany(Company company);
    void setUser(Users user);
}
