package br.com.biv.simplebank.domain.service;

import br.com.biv.simplebank.domain.model.Transaction;

public interface TransactionService {
    Transaction save(Transaction transaction);
}
