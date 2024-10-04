package com.Banking.MiniStatementService.Controller;

import com.Banking.MiniStatementService.FeignClient.TransactionDetailsClient;
import com.Banking.MiniStatementService.dto.TransactionDetailsDto;
import com.Banking.MiniStatementService.dto.TransferStatementsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class MiniStatementController {

    @Autowired
    private TransactionDetailsClient transactionDetailsClient;

    @GetMapping("/getMiniStatement/{accountNumber}")
    public List<TransferStatementsDto> getMiniStatement(@PathVariable long accountNumber) {
        return transactionDetailsClient.getTransferStatements(accountNumber);
    }
}

