package com.cybertek;

import com.cybertek.collections.ArrayLists;
import com.cybertek.core.Loops;
import com.cybertek.core.Methods;
import com.cybertek.core.SelectionStatements;
import com.cybertek.core.StringMethods;
import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;
import com.cybertek.oop.abstraction.implementation.UserServiceImplement;
import com.cybertek.oop.abstraction.service.UserService;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.inheritance.BaseEntity;
import com.cybertek.oop.inheritance.Project;
import com.cybertek.oop.polymorphism.Employee;


import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        //**********CORE**********//
        Methods methods = new Methods();
        methods.methodA();
        methods.methodA("Apple");
        methods.methodB();
        methods.methodB("Apple");
        Methods.methodC();

        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();

        Loops.demoForIterator();
        Loops.demoForEach();
        System.out.println();

        StringMethods.demoStringMethod();

        //**********ENUM**********//
        System.out.println(Gender.MALE);
        System.out.println(Status.IN_PROGRESS.getValue().substring(2));

        //**********OOP-Encapsulation**********//
        User user = new User("Mike","Smith",new Role(1,"Manager"));
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());

        //**********OOP-Inheritance**********//
        Project project = new Project(1, LocalDateTime.now(),1,
                                        LocalDateTime.now().plusHours(1),1,"PRJ001","Human Resource CRM",
                                        new User("Mike","Smith",new Role(1,"Manager")),
                                        LocalDate.now(), LocalDate.now().plusDays(6), Status.IN_PROGRESS,"HCRM Detail Information");


        //**********OOP-Interface**********//
        UserService userService = new UserService();
        System.out.println(userService.userByUserName("Ozzy").getFirstName());

        //**********OOP-Polymorphism**********//
        Employee employee = new Employee();
        BaseEntity employee2 = new Employee();
        UserService userService2 = new UserService();

        //**********Collections**********//
        ArrayLists.createList();
        ArrayLists.createUserList();
        ArrayLists.createRoleList().get(0).getDescription();

    }
}
