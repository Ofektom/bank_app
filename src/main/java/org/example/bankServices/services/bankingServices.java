package org.example.bankServices.services;

import org.example.bankServices.entities.Account;
import org.example.bankServices.entities.Customer;
import org.example.bankServices.entities.Transaction;

public interface bankingServices {
    Transaction credit();

    Transaction debit();

    Customer deposit();
    Customer withdraw();
    void escalate();
    String complaits();
}
