package com.cybertek.oop.abstraction.service;

import com.cybertek.oop.abstraction.implementation.UserServiceImplement;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;

public class UserService implements UserServiceImplement {

    @Override
    public String userByRoleId(Long id) {
        User user = new User("Mike","Smith",new Role(id,"Manager"));
        return user.getFirstName() + " " + user.getLastName();
    }

    @Override
    public User userByUserName(String userName) {
        User user = new User(userName,"Smith",new Role(1,"Employee"));
        return user;
    }
}
