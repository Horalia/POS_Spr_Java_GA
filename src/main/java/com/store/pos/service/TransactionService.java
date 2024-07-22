package com.store.pos.service;

import com.store.pos.model.Transaction;

import java.util.List;

public interface TransactionService {

    List<Transaction> getAllTransactions();
}
