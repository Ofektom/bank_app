package org.example.bankServices.entities;

import org.example.bankServices.enums.Disabled;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    private Long accountNumber;
    private List<Account> listOfAccounts = new ArrayList<>();
    private Disabled option;

}
