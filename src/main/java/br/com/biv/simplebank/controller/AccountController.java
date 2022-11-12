package br.com.biv.simplebank.controller;

import br.com.biv.simplebank.controller.resource.AccountRequest;
import br.com.biv.simplebank.controller.resource.AccountResponse;
import br.com.biv.simplebank.controller.mapper.AccountRequestToAccountMapper;
import br.com.biv.simplebank.controller.mapper.AccountToAccountResponseMapper;
import br.com.biv.simplebank.domain.model.Account;
import br.com.biv.simplebank.domain.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@EnableSwagger2
@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    AccountService accountService;
    @Autowired
    AccountRequestToAccountMapper accountRequestToAccountMapper;
    @Autowired
    AccountToAccountResponseMapper accountToAccountResponseMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AccountResponse createAccount(@RequestBody AccountRequest accountRequest) {
        log.info("[POST][REQUEST]: Creating account {}", accountRequest);
        Account account = accountRequestToAccountMapper.convertToAccount(accountRequest);
        Account accountSaved = accountService.save(account);
        AccountResponse accountResponse = accountToAccountResponseMapper.convertToAccountResponse(account);
        log.info("[POST][RESPONSE]: Account create with success, accountId {}", accountSaved.getAccountId());
        return accountResponse;
    }
}
