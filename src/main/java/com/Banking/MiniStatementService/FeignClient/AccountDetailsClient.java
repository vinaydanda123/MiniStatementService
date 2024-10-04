package com.Banking.MiniStatementService.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "account-details",url = "http://localhost:9001")
public interface AccountDetailsClient {

}
