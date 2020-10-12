package com.cybertek.oop.abstraction.service;

import com.cybertek.enums.Gender;
import com.cybertek.oop.abstraction.implementation.UserServiceImplement;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;

public class UserService implements UserServiceImplement {

    @Override
    public String userByRoleId(Long id) {
        User user = new User("Mike","Smith",new Role(id,"Manager"), Gender.MALE);
        return user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public User userByFirstName(String firstName) {
        User user = new User(firstName,"Smith",new Role(1,"Employee"),Gender.MALE);
        return user;
    }
}
