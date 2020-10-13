package com.cybertek.lambda.sorting;
import com.cybertek.oop.encapsulation.Role;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
    Integer employeeId;
    String employeeFirstName;
    String employeeLastName;
    String employeeCity;
    Role role;
}
