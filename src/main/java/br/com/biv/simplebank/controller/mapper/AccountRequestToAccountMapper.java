package br.com.biv.simplebank.controller.mapper;

import br.com.biv.simplebank.controller.resource.AccountRequest;
import br.com.biv.simplebank.domain.model.Account;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class AccountRequestToAccountMapper {

    public Account convertToAccount(AccountRequest accountRequest) {
        return Account
                .builder()
                .documentNumber(accountRequest.getDocumentNumber())
                .build();
    }
}
