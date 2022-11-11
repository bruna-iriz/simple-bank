package br.com.biv.simplebank.service.impl;

import br.com.biv.simplebank.repository.TransactionsRepository;
import br.com.biv.simplebank.service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionsService {

    @Autowired
    TransactionsRepository transactionsRepository;
}
