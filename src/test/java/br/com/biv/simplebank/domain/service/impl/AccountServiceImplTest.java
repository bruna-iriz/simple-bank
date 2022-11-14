package br.com.biv.simplebank.domain.service.impl;

import br.com.biv.simplebank.domain.model.Account;
import br.com.biv.simplebank.domain.repository.AccountRepository;
import br.com.biv.simplebank.domain.service.AccountService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountServiceImplTest {

    @InjectMocks
    AccountServiceImpl accountServiceImpl;
    @Mock
    AccountService accountService;
    @Mock
    AccountRepository accountRepository;

    @Test
    public void shouldGetById() {
        final var account = Account
                .builder()
                .accountId(1L)
                .documentNumber("123")
                .build();
        when(accountRepository.findById(1L)).thenReturn(Optional.of(account));
        final Optional<Account> serviceById = accountServiceImpl.findById(1L);
        assertEquals(1L, account.getAccountId());
    }
}