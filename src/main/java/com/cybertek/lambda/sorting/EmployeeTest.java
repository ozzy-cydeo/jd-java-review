package com.cybertek.lambda.sorting;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee(101,"Mike","Smith","VA");
        Employee e2 = new Employee(102,"Tom","Smith","DC");
        Employee e3 = new Employee(103,"Evan","Smith","IL");
        Employee e4 = new Employee(104,"Ammy","Smith","NY");
        Employee e5 = new Employee(105,"Adam","Smith","NJ");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        employeeList.sort((emp1,emp2) -> emp1.employeeId.compareTo(emp2.employeeId));
        System.out.println(employeeList);

        employeeList.sort((emp2,emp1) -> emp1.employeeId.compareTo(emp2.employeeId));
        System.out.println(employeeList);
    }
}
