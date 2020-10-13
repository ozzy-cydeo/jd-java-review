package com.cybertek.streams.exercises;

import com.cybertek.enums.Status;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.inheritance.Project;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {


    public static List<Project> getListOfProject() {

        return DataGenerator.getProjects();
    }

    public static List<Project> getListOfProject(Status status) {
        return DataGenerator.getProjects().stream().filter(x -> x.getProjectStatus().equals(status)).collect(Collectors.toList());
    }

    public static List<Project> getListOfProject(User manager) {
        return DataGenerator.getProjects().stream().filter(x -> x.getAssignedManager() == manager).collect(Collectors.toList());
    }

    public static Project getProjectByProjectCode(String projectcode) {
        return DataGenerator.getProjects().stream().filter(x -> x.getProjectCode().equals(projectcode)).findFirst().get();
    }

    public static List<User> listOfUsers() {
        return DataGenerator.getUsers();
    }

    public static User userByFirstName(String firstName) {
        return DataGenerator.getUsers().stream().filter(x ->x.getFirstName().equals(firstName)).findFirst().get();
    }

    public static String userByUserId(Long id) {
        User user = DataGenerator.getUsers().stream().filter(x -> x.getId() == id).findFirst().get();
        return user.getFirstName() + " " + user.getLastName();
    }

    public static List<User> deleteUser(String firstName) {
        return listOfUsers().stream().filter(x -> x.getFirstName().equals(firstName) == false).collect(Collectors.toList());
    }


    //5 task
    /*
    public static List<Project> updateProjectStatus(Status old,Status current) {
        List<Project> updatedStatus = DataGenerator.getProjects().stream()
                .filter(x -> x.getProjectStatus().equals(old))
                .map(x -> {
                    x.setProjectStatus(current);
                    return x;
                }).collect(Collectors.toList());
        return updatedStatus;
    }
    */

    public static List<Project> updateProjectStatus(Status old,Status current) {
        List<Project> updatedStatus = DataGenerator.getProjects().stream()
                .filter(x -> x.getProjectStatus().equals(old))
                .peek(x -> x.setProjectStatus(current))
                .collect(Collectors.toList());
        return updatedStatus;
    }

    public static List<Project> findProjectByManager(User manager1){
        return DataGenerator.getProjects().stream()
               .filter(x -> x.getAssignedManager().equals(manager1))
               .collect(Collectors.toList());
    }

    public static List<Project> findprojectAccordingToDateAndStatus(Status status){
        return DataGenerator.getProjects().stream()
                .filter(x->x.getProjectStatus().equals(status)
                        && x.getStartDate().isBefore(LocalDate.now().minusDays(4)))
                .collect(Collectors.toList());
    }













}
