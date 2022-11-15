package br.com.biv.simplebank.controller;

import br.com.biv.simplebank.controller.mapper.TransactionToTransactionResourceMapper;
import br.com.biv.simplebank.domain.model.Account;
import br.com.biv.simplebank.domain.model.Transaction;
import br.com.biv.simplebank.domain.model.enums.OperationsType;
import br.com.biv.simplebank.domain.service.TransactionService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TransactionController.class)
class TransactionControllerTest {

    @MockBean
    TransactionService transactionService;
    @MockBean
    TransactionToTransactionResourceMapper transactionMapper;
    @Autowired
    MockMvc mockMvc;

    @Test
    void shouldCreateMockMvc() {
        assertNotNull(mockMvc);
    }


    @BeforeEach
    void build() {
        final Account build = Account
                .builder()
                .accountId(1234L)
                .documentNumber("909876543212")
                .build();

        final Transaction transaction = Transaction
                .builder()
                .accountId(1234L)
                .account(build)
                .build();
        transactionService.save(transaction);
    }

    @Test
    public void shouldReturnSuccess_WhenCreateTransaction() throws Exception {

        final Transaction transaction = Transaction
                .builder()
                .accountId(Account.builder().build().getAccountId())
                .operationType(OperationsType.PAGAMENTO)
                .amount(BigDecimal.valueOf(20.00))
                .build();

        mockMvc.perform(post("/transactions")
                .contentType(MediaType.APPLICATION_JSON)
                .characterEncoding("UTF-8")
                .content("{" +
                        "\"account_id\": 1," +
                        "\"operation_type_id\": 1," +
                        "\"amount\": 200.00" +
                        "}"))
                .andExpect(status().isCreated());
    }
}