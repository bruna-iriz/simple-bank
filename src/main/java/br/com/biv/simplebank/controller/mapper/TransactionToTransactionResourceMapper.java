package br.com.biv.simplebank.controller.mapper;

import br.com.biv.simplebank.controller.resource.TransactionRequest;
import br.com.biv.simplebank.controller.resource.TransactionResponse;
import br.com.biv.simplebank.domain.model.Transaction;
import br.com.biv.simplebank.domain.service.ValidateOperationType;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class TransactionToTransactionResourceMapper {

    private final ModelMapper modelMapper;
    private final ValidateOperationType validateOperationType;

    public Transaction convertToTransaction(TransactionRequest transactionRequest) {
        transactionRequest.setAmount(ValidateAmountNegative(transactionRequest));
        final Transaction transaction = modelMapper.map(transactionRequest, Transaction.class);
        System.out.println(transaction.getAmount());
        return transaction;
    }

    private BigDecimal ValidateAmountNegative(TransactionRequest transactionRequest) {
        return validateOperationType.isNegativePayment(transactionRequest) ? transactionRequest.getAmount().negate() : transactionRequest.getAmount();
    }

    public TransactionResponse convertToTransactionResponse(Transaction transaction) {
        return modelMapper.map(transaction, TransactionResponse.class);
    }

    public List<TransactionResponse> convertToTransactionsResponseList(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(this::convertToTransactionResponse)
                .collect(Collectors.toList());
    }
}
