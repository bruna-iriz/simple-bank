package br.com.biv.simplebank.controller;

import br.com.biv.simplebank.controller.mapper.AccountToAccountResourceMapper;
import br.com.biv.simplebank.domain.model.Account;
import br.com.biv.simplebank.domain.service.AccountService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AccountController.class)
class AccountControllerTest {

    @MockBean
    AccountService accountService;
    @MockBean
    AccountToAccountResourceMapper accountToAccountResourceMapper;
    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper mapper;

    @Test
    void shouldCreateMockMvc() {
        assertNotNull(mockMvc);
    }

    @Test
    public void shouldReturnSuccess_WhenGetConversationById() throws Exception {

        final var account = Account
                .builder()
                .accountId(1234L)
                .documentNumber("909876543212")
                .build();

        when(accountService.findById(account.getAccountId())).thenReturn(Optional.of(account));

        this.mockMvc
                .perform(get("/accounts/{accountId}", 1234))
                .andExpect(status().isOk());

        verify(accountToAccountResourceMapper, atLeastOnce()).convertToAccountResponse(any());
        assertEquals("909876543212", account.getDocumentNumber());
    }
}