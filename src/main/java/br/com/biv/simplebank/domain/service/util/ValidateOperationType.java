package br.com.biv.simplebank.domain.service.util;

import br.com.biv.simplebank.controller.resource.TransactionRequest;
import br.com.biv.simplebank.domain.model.enums.OperationsType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static br.com.biv.simplebank.domain.model.enums.OperationsType.*;

@Service
@AllArgsConstructor
public class ValidateOperationType {

    public boolean isNegativePayment(TransactionRequest transactionRequest) {
        final OperationsType operationType = transactionRequest.getOperationType();
        return operationType.equals(SAQUE) || operationType.equals(COMPRA_A_VISTA) || operationType.equals(COMPRA_PARCELADA);
    }
}


