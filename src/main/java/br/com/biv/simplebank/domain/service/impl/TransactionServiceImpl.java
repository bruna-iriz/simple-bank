package br.com.biv.simplebank.domain.service.impl;

import br.com.biv.simplebank.domain.model.Transaction;
import br.com.biv.simplebank.domain.repository.TransactionRepository;
import br.com.biv.simplebank.domain.service.util.ValidateOperationType;
import br.com.biv.simplebank.domain.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;
    @Autowired
    ValidateOperationType validateOperationType;

    @Override
    public Transaction save(final Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
