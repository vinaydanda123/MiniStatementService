package com.Banking.MiniStatementService.dto;

import lombok.Data;

import java.util.Date;

@Data
public class TransferStatementsDto {
    private long transactionId;
    private long accountNumber;
    private long toAccountNumber;
    private String transactionType;
    private Date transactionDate;
    private double updatedBalance;
    private double transactionAmount;
}
