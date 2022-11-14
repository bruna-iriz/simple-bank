package br.com.biv.simplebank.domain.service;

import br.com.biv.simplebank.controller.resource.TransactionRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static br.com.biv.simplebank.domain.model.enums.OperationsType.COMPRA_A_VISTA;
import static br.com.biv.simplebank.domain.model.enums.OperationsType.SAQUE;

@Service
@AllArgsConstructor
public class ValidateOperationType {

    public boolean isNegativePayment(TransactionRequest transactionRequest) {
        return transactionRequest.getOperationType().equals(COMPRA_A_VISTA) || transactionRequest.getOperationType().equals(SAQUE);
    }
}


