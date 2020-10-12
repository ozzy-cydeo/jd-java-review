package com.cybertek.streams.exercises;

import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.inheritance.Project;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

    public static Role adminRole = new Role(1, "Admin");
    public static Role managerRole = new Role(2, "Manager");
    public static Role employeeRole = new Role(3, "Employee");

    public static List<Role> getRoles() {

        List<Role> roles = new ArrayList<>();

        roles.add(employeeRole);
        roles.add(managerRole);
        roles.add(adminRole);

        return roles;
    }

    public static User manager1 = new User(2, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "Delisa",
            "Norre", managerRole, Gender.FEMALE);

    public static User manager2 = new User(3, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "Craig",
            "Jark", managerRole, Gender.MALE);

    public static Project project1 = new Project(1, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1,
            "PRJ001", "Human Resource CRM", manager1, LocalDate.now(), LocalDate.now().plusDays(6), Status.IN_PROGRESS,
            "HCRM Detail Information");

    public static Project project2 = new Project(2, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1,
            "PRJ002", "Infra Upgrade", manager2, LocalDate.now(), LocalDate.now().plusDays(3), Status.UAT_TEST,
            "Server Details");

    public static List<Project> getProjects() {

        List<Project> projects = new ArrayList<>();

        projects.add(project1);
        projects.add(project2);

        return projects;

    }

    public static User user1 = new User(1, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "John", "Kesy",
             adminRole, Gender.MALE);

    public static User user2 = new User(2, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "Delisa",
            "Norre", managerRole, Gender.FEMALE);

    public static User user3 = new User(3, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "Craig", "Jark",
            employeeRole, Gender.MALE);

    public static User user4 = new User(4, LocalDateTime.now(), 1, LocalDateTime.now().plusHours(1), 1, "Shaun",
            "Hayns",employeeRole, Gender.MALE);

    public static List<User> getUsers() {

        List<User> users = new ArrayList<>();

        users.add(user1);

        users.add(user2);

        users.add(user3);

        users.add(user4);

        return users;
    }















}
