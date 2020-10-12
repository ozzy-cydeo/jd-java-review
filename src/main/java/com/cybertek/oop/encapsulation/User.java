package com.cybertek.oop.encapsulation;
import com.cybertek.enums.Gender;
import com.cybertek.oop.inheritance.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity{
    private String firstName;
    private String lastName;
    private Role role;
    private Gender gender;

    public User(long id, LocalDateTime insertDateTime, long insertUserId, LocalDateTime lastUpdateDateTime,
                long lastUpdateUserId, String firstname, String lastname,Role role, Gender gender) {
        super(id, insertDateTime, insertUserId, lastUpdateDateTime, lastUpdateUserId);
        this.firstName = firstname;
        this.lastName = lastname;
        this.role = role;
        this.gender = gender;
    }





}
