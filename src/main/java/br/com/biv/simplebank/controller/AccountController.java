package br.com.biv.simplebank.controller;

import br.com.biv.simplebank.dto.AccountDto;
import br.com.biv.simplebank.model.AccountModel;
import br.com.biv.simplebank.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Optional;
import java.util.UUID;

@Slf4j
@EnableSwagger2
@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    AccountService accountService;

    @GetMapping("/{id}")
    public Optional<AccountModel> getById(@PathVariable(value = "id", required = true) UUID accountId) {
        log.info("[GET-BY-ID][REQUEST]: {}", accountId);
        return accountService.findById(accountId);
    }
}
