package com.cybertek;

import com.cybertek.core.Loops;
import com.cybertek.core.SelectionStatements;
import com.cybertek.core.StringMethods;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;

public class Main {

    public static void main(String[] args) {

        //**********CORE REVIEW**********//
        SelectionStatements.demoIfStatement();
        SelectionStatements.demoSwitchCaseStatement();
        Loops.demoForIterator();
        Loops.demoForEach();
        System.out.println();
        StringMethods.demoStringMethod();

        //**********OOP-Encapsulation**********//
        User user = new User("Mike","Smith",new Role(1,"Manager"));
        System.out.println(user.getUserName());
        System.out.println(user.getLastName());
        System.out.println(user.getRole().getDescription());



    }
}
