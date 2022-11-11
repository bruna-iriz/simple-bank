package br.com.biv.simplebank.service.impl;

import br.com.biv.simplebank.repository.AccountRepository;
import br.com.biv.simplebank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;
}
