package org.example.bankServices.entities;

import org.example.bankServices.enums.TransactionType;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private Account account;
    private BigDecimal amount;
    private TransactionType type;
    private LocalDate date;
}
