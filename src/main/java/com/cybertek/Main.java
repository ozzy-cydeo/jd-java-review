package com.cybertek;

import com.cybertek.collections.ArrayLists;
import com.cybertek.core.Loops;
import com.cybertek.core.Methods;
import com.cybertek.core.SelectionStatements;
import com.cybertek.core.StringMethods;
import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;
import com.cybertek.lambda.Addable;
import com.cybertek.lambda.Drawable;
import com.cybertek.lambda.Drawable2;
import com.cybertek.lambda.Drawable3;
import com.cybertek.oop.abstraction.implementation.UserServiceImplement;
import com.cybertek.oop.abstraction.service.UserService;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.inheritance.BaseEntity;
import com.cybertek.oop.inheritance.Project;
import com.cybertek.oop.polymorphism.Employee;
import com.cybertek.streams.exercises.StreamDemo;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

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


        //**********OOP-Encapsulation**********//
        User user = new User("Mike","Smith",new Role(1,"Manager"),Gender.MALE);
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());

        //**********OOP-Inheritance**********//
        Project project = new Project(1, LocalDateTime.now(),1,
                                        LocalDateTime.now().plusHours(1),1,"PRJ001","Human Resource CRM",
                                        new User("Mike","Smith",new Role(1,"Manager"),Gender.MALE),
                                        LocalDate.now(), LocalDate.now().plusDays(6), Status.IN_PROGRESS,"HCRM Detail Information");


        //**********OOP-Interface**********//
        UserService userService = new UserService();
        System.out.println(userService.userByFirstName("Ozzy").getLastName());

        //**********OOP-Polymorphism**********//
        Employee employee = new Employee();
        BaseEntity employee2 = new Employee();
        UserServiceImplement userService2 = new UserService();

        employee.getEmployeeHours();
        ((Employee)employee2).getEmployeeHours(); //Down Casting

        //**********ENUM**********//
        System.out.println(Gender.MALE);
        System.out.println(Status.IN_PROGRESS.getValue().substring(2));

        //**********Collections**********//
        ArrayLists.createList();
        ArrayLists.createUserList();
        ArrayLists.createRoleList().get(0).getDescription();

        //**********Lambda**********//

        //No Parameter,No Return Type
        Drawable drawable = () -> System.out.println("Drawing");
        drawable.draw();
        //Single Parameter,No Return Type
        Drawable2 drawable2 = shape -> System.out.println("Drawing " + shape);
        drawable2.draw("Circle");
        //Multiple Parameters,No Return Type
        Drawable3 drawable3 = (shape, name) -> System.out.println(name + " is drawing a " + shape);
        drawable3.draw("Square","Ozzy");
        //Parameter,Return Type
        Addable addable = (number1,number2) -> number1+number2;
        int result = addable.add(3,5);
        System.out.println(result);

        Addable addable2 = (number1, number2) -> {
            int result2 = number1+number2;
            int newResult = 5 * result2;
            return newResult;
        };
        System.out.println(addable2.add(3,5));



        for(Project p : StreamDemo.getListOfProject(Status.UAT_TEST) ){
            System.out.println(p.getAssignedManager().getFirstName());
        }







    }
}
