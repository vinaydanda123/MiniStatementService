package com.Banking.MiniStatementService.FeignClient;

import com.Banking.MiniStatementService.dto.TransactionDetailsDto;
import com.Banking.MiniStatementService.dto.TransferStatementsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "transaction-details",url = "http://localhost:9002")
public interface TransactionDetailsClient {

    @GetMapping("/getTransferStatements/{accountNumber}")
    public List<TransferStatementsDto> getTransferStatements(@PathVariable long accountNumber);
//    @GetMapping("/getTransactionDetails/{accountNumber}")
//    public List<TransactionDetailsDto> getTransactionDetails(@PathVariable long accountNumber);

}
