package br.com.biv.simplebank.service.impl;

import br.com.biv.simplebank.repository.TransactionRepository;
import br.com.biv.simplebank.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;
}
