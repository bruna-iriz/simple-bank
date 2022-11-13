package br.com.biv.simplebank.controller.mapper;

import br.com.biv.simplebank.controller.resource.TransactionRequest;
import br.com.biv.simplebank.controller.resource.TransactionResponse;
import br.com.biv.simplebank.domain.model.Transaction;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class TransactionToTransactionResourceMapper {

    private final ModelMapper modelMapper;

    public Transaction convertToTransaction(TransactionRequest transactionRequest) {
        return modelMapper.map(transactionRequest, Transaction.class);
    }


    public TransactionResponse convertToTransactionResponse(Transaction transaction) {
        return modelMapper.map(transaction, TransactionResponse.class);
    }

    public List<TransactionResponse> convertToTransactionsResponseList(List<Transaction> transactions) {
        return transactions
                .stream()
                .map(transaction -> convertToTransactionResponse(transaction))
                .collect(Collectors.toList());
    }
}
