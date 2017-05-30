package me.aximcore.model.user;

import me.aximcore.model.company.Company;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by aximcore on 2017.05.07..
 */
@Entity
@Table(name = "user_tasks")
public class UserTasks {
    @Id
    @GeneratedValue
    private int id;
    @NotEmpty
    private String title;

    private String description;
    @Enumerated(EnumType.STRING) // enum id elcsúszásának elkerülése véget
    private UserTaskType type;
    @Enumerated(EnumType.STRING)
    private UserTaskPiority priority;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime startDate;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime endDate;

    private boolean active;
    @Basic(fetch = FetchType.EAGER)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private Company company;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserTaskType getType() {
        return type;
    }

    public void setType(UserTaskType type) {
        this.type = type;
    }

    public UserTaskPiority getPriority() {
        return priority;
    }

    public void setPriority(UserTaskPiority priority) {
        this.priority = priority;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
