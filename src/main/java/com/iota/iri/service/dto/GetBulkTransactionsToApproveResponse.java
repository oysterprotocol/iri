package com.iota.iri.service.dto;

import com.iota.iri.model.Hash;

public class GetBulkTransactionsToApproveResponse extends AbstractResponse {

    private Hash[] transactions;

    public static AbstractResponse create(Hash[] transactionList) {
        GetBulkTransactionsToApproveResponse res = new GetBulkTransactionsToApproveResponse();
        res.transactions = transactionList;
        return res;
    }

    public Hash[] getTransactions() {
        return transactions;
    }
}