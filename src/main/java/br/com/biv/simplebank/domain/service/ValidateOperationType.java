package br.com.biv.simplebank.domain.service;

import br.com.biv.simplebank.controller.resource.TransactionRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static br.com.biv.simplebank.domain.model.enums.OperationsType.*;

@Service
@AllArgsConstructor
public class ValidateOperationType {

    public boolean isNegativePayment(TransactionRequest transactionRequest) {
        final var operationType = transactionRequest.getOperationType();
        return operationType.equals(SAQUE) || operationType.equals(COMPRA_A_VISTA) || operationType.equals(COMPRA_PARCELADA);
    }
}


