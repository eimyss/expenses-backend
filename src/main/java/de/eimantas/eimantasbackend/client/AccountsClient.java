package de.eimantas.eimantasbackend.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "${feign.client.config.account.name}", configuration = AccountsClientConfig.class)
public interface AccountsClient {

    @GetMapping("/account/list/id")
    Collection<Long> getAccountList();
}

