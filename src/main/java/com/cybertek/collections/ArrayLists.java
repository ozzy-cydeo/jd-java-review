package com.cybertek.collections;

import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void createList(){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(6);

        for(Integer l : list){
            System.out.println(l);
        }
    }

    public static void createUserList(){
        List<User> userList = new ArrayList<>();
        userList.add(new User("Mike","Smith",new Role(1,"Manager")));
        userList.add(new User("Temmy","Dallis",new Role(2,"Employee")));
        for(User l : userList){
            System.out.println(l.getRole().getDescription());
        }
    }

    public static List<Role> createRoleList(){
        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role(1,"Manager"));
        roleList.add(new Role(2,"Employee"));
        return roleList;
    }




}
