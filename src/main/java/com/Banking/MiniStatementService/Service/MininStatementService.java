package com.Banking.MiniStatementService.Service;

import com.Banking.MiniStatementService.FeignClient.TransactionDetailsClient;
import com.Banking.MiniStatementService.Repository.MiniStatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MininStatementService {
    @Autowired
    private MiniStatementRepository miniStatementRepository;
    @Autowired
    private TransactionDetailsClient transactionDetailsClient;

}
