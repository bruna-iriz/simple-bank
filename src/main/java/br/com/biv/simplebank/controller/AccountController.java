package br.com.biv.simplebank.controller;

import br.com.biv.simplebank.controller.mapper.AccountToAccountResourceMapper;
import br.com.biv.simplebank.controller.resource.AccountRequest;
import br.com.biv.simplebank.controller.resource.AccountResponse;
import br.com.biv.simplebank.domain.model.Account;
import br.com.biv.simplebank.domain.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Optional;

@Slf4j
@EnableSwagger2
@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    AccountService accountService;
    @Autowired
    AccountToAccountResourceMapper accountToAccountResourceMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AccountResponse createAccount(@RequestBody AccountRequest accountRequest) {
        log.info("[POST][REQUEST]: Creating account {}", accountRequest.getDocumentNumber());
        Account account = accountToAccountResourceMapper.convertToAccount(accountRequest);
        Account accountSaved = accountService.save(account);
        AccountResponse accountResponse = accountToAccountResourceMapper.convertToAccountResponse(accountSaved);
        log.info("[POST][RESPONSE]: Account create with success, accountId {}.", accountSaved.getAccountId());
        return accountResponse;
    }

    @GetMapping("/{accountId}")
    public AccountResponse getById(@PathVariable(value = "accountId", required = true) Long accountId) {
        log.info("[GET-BY-ID][REQUEST]: Searching for accountId {}", accountId);
        Optional<Account> accountById = accountService.findById(accountId);
        final AccountResponse accountResponse = accountToAccountResourceMapper.convertToAccountResponse(accountById.get());
        log.info("[GET-BY-ID][RESPONSE] Account information found.");
        return accountResponse;
    }

//    @GetMapping
//    public ResponseEntity<List<AccountResponse>> listAll() {
//        List<Account> accounts = accountService.listAll();
//        List<AccountResponse> acountResponse = accountToAccountResponseMapper.convertToAccountResponseList(accounts);
//        return ResponseEntity.status(HttpStatus.OK).body(acountResponse);
//    }
}
