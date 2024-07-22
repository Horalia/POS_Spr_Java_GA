package com.store.pos.rest;

import com.store.pos.model.Transaction;
import com.store.pos.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TransactionRest {

    private final TransactionService transactionService;

    @Autowired
    public TransactionRest(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/rest/transaction/all")
    public List<Transaction> getAllTransactions(HttpServletResponse response) {
        try {
            return transactionService.getAllTransactions();
        } catch (Exception e) {
            System.err.println("Failed to retrieve transactions: " + e.getCause());
            response.setStatus(HttpServletResponse.SC_BAD_GATEWAY);
            return new ArrayList<>();
        }
    }
}

