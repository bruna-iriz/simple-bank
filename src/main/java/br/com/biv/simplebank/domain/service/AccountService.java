package br.com.biv.simplebank.domain.service;

import br.com.biv.simplebank.domain.model.Account;

import java.util.Optional;
import java.util.UUID;

public interface AccountService {
    Optional<Account> findById(UUID accountId);

    Account save(Account account);
}
