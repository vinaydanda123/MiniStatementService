package com.Banking.MiniStatementService.dto;

import lombok.Data;

import java.util.Date;
@Data
public class TransactionDetailsDto {
    private long transactionId;
    private long accountNumber;
    private double transactionAmount;
    private long recieverAccountNumber;
    private String recieverAccountHolderName;
    private String transactionType;
    private Date transactionDate;
}
