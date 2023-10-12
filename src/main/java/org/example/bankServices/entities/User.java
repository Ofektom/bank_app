package org.example.bankServices.entities;

import org.example.bankServices.enums.Gender;
import org.example.bankServices.enums.Marrital;

import java.time.LocalDate;

public abstract class User{
    private String firstName;
    private String lastName;
    private String otherName;
    private Gender gender;
    private LocalDate dateOfBirth;
    private Address address;
    private Long phone;
    private Long bvn;

    private Marrital status;


}
