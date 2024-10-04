package com.Banking.MiniStatementService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class MiniStatement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long transactionId;
    private long accountNumber;
    private long recieverAccountNumber;
    private String transactionType;
    private double transactionamount;
    private double updatedbalance;
    private String transactionDate;
}
