package org.example.bankServices.entities;

import org.example.bankServices.enums.AccountType;

import java.math.BigDecimal;
import java.util.List;

public abstract class Account {
    private static final Double MINIMUM_BALANCE = 500.00;
    private List<Customer> customer;
    private AccountType type;
    private BigDecimal balance;

}
