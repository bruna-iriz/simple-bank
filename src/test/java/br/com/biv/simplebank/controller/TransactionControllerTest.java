//package br.com.biv.simplebank.controller;
//
//import br.com.biv.simplebank.controller.mapper.TransactionToTransactionResourceMapper;
//import br.com.biv.simplebank.controller.resource.TransactionRequest;
//import br.com.biv.simplebank.controller.resource.TransactionResponse;
//import br.com.biv.simplebank.domain.model.Account;
//import br.com.biv.simplebank.domain.model.Transaction;
//import br.com.biv.simplebank.domain.model.enums.OperationsType;
//import br.com.biv.simplebank.domain.service.TransactionService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.math.BigDecimal;
//
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//@WebMvcTest(TransactionController.class)
//class TransactionControllerTest {
//
//    @MockBean
//    TransactionService transactionService;
//    @MockBean
//    TransactionToTransactionResourceMapper transactionMapper;
//    @Autowired
//    ObjectMapper mapper;
//    @Autowired
//    MockMvc mockMvc;
//
//    @Test
//    void shouldCreateMockMvc() {
//        assertNotNull(mockMvc);
//    }
//
////    @Test
////    public void shouldReturnSuccess_WhenCreateTransaction() throws Exception {
////
////        TransactionRequest request = TransactionRequest.builder()
////                .accountId(10L)
////                .amount(BigDecimal.valueOf(200))
////                .operationType(OperationsType.COMPRA_A_VISTA)
////                .build();
////
////        TransactionResponse transactionRequest = transactionMapper.convertToTransactionResponse(Transaction.builder().build());
////
////        mockMvc.perform(MockMvcRequestBuilders.post("/transactions")
////                .contentType(MediaType.APPLICATION_JSON)
//////                .characterEncoding("UTF-8")
////                .content(String.valueOf(transactionRequest))
////        )
////                .andExpect(MockMvcResultMatchers.status().isCreated())
////                .andDo(MockMvcResultHandlers.print());
////    }
//
//}