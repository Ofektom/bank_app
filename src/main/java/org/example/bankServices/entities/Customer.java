package org.example.bankServices.entities;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User{
    private Long accountNumber;
    private List<Account> listOfAccounts = new ArrayList<>();

}
