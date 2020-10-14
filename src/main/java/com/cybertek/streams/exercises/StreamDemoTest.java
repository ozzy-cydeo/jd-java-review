package com.cybertek.streams.exercises;

import com.cybertek.enums.Status;

public class StreamDemoTest {
    public static void main(String[] args) {

        System.out.println(StreamDemo.getListOfProject());

        System.out.println(StreamDemo.getListOfProject(Status.IN_PROGRESS));

        System.out.println(StreamDemo.getListOfProject(DataGenerator.manager1));

        System.out.println(StreamDemo.getProjectByProjectCode("PRJ001"));

        System.out.println(StreamDemo.getListOfUsers().get(2).getFirstName());

        System.out.println(StreamDemo.totalProjectDurationForManager(DataGenerator.manager1));

        System.out.println(StreamDemo.findTotalMaleInCompany());


    }
}
