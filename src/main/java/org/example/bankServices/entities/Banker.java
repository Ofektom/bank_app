package org.example.bankServices.entities;

import org.example.bankServices.enums.Role;

import java.math.BigDecimal;

public class Banker extends User{
    private Long staffNumber;
    private BigDecimal target;
    private Role role;
    private BigDecimal salary;
}
