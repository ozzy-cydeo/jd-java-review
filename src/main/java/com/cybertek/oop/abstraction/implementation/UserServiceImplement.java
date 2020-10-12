package com.cybertek.oop.abstraction.implementation;

import com.cybertek.oop.encapsulation.User;

public interface UserServiceImplement {

    String userByRoleId(Long id);
    User userByFirstName(String firstName);
}
