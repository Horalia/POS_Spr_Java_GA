package com.store.pos.dao;

import com.store.pos.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionDaoImpl implements TransactionDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public TransactionDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        String sql = "select * from POS.TRANSACTIONS";

        return jdbcTemplate.query(sql, (result, index) -> {
            Transaction transaction = new Transaction(result.getDouble("RECEIPT"), result.getDouble("PAYMENT"), result.getString("METHOD"), result.getDate("DATE"));
            return transaction;
        });
    }


}
