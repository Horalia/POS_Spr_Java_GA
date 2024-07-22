package com.store.pos.dao;

import com.store.pos.model.Transaction;

import java.util.List;

public interface TransactionDao {

    List<Transaction> getAllTransactions();
}
