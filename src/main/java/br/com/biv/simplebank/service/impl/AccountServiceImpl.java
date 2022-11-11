package br.com.biv.simplebank.service.impl;

import br.com.biv.simplebank.model.AccountModel;
import br.com.biv.simplebank.repository.AccountRepository;
import br.com.biv.simplebank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public Optional<AccountModel> findById(UUID accountId) {
        return accountRepository.findById(accountId);
    }
}
