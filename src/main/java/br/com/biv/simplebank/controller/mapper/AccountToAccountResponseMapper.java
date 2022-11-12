package br.com.biv.simplebank.controller.mapper;

import br.com.biv.simplebank.controller.resource.AccountResponse;
import br.com.biv.simplebank.domain.model.Account;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AccountToAccountResponseMapper {

    public AccountResponse convertToAccountResponse(Account account) {
        return AccountResponse
                .builder()
                .accountId(account.getAccountId())
                .documentNumber(account.getDocumentNumber())
                .build();
    }
}
