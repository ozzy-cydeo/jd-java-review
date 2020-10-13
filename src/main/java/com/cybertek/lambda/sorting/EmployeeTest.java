package com.cybertek.lambda.sorting;

import com.cybertek.enums.Gender;
import com.cybertek.oop.encapsulation.Role;
import com.cybertek.oop.encapsulation.User;



import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee(101,"Mike","Smith","VA",new Role(15,"Developer"));
        Employee e2 = new Employee(11,"Mike","Smith","VA",new Role(5,"SDET"));
        Employee e3 = new Employee(67,"Mike","Smith","VA",new Role(50,"DBA"));
        Employee e4 = new Employee(33,"Mike","Smith","VA",new Role(7,"SCRUM MASTER"));
        Employee e5 = new Employee(8,"Mike","Smith","VA",new Role(12,"ARCHITECT"));

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        employeeList.sort((emp1,emp2) -> emp1.employeeId.compareTo(emp2.employeeId));
        System.out.println(employeeList);

        employeeList.sort((emp2,emp1) -> emp1.getRole().getId().compareTo(emp2.getRole().getId()));
        System.out.println(employeeList);


    }
}
