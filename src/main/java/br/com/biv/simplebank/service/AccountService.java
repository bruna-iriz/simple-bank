package br.com.biv.simplebank.service;

import br.com.biv.simplebank.model.AccountModel;

import java.util.Optional;
import java.util.UUID;

public interface AccountService {
    Optional<AccountModel> findById(UUID accountId);
}
