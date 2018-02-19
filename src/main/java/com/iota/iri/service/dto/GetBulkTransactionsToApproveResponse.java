package com.iota.iri.service.dto;

import com.iota.iri.model.Hash;

public class GetBulkTransactionsToApproveResponse extends AbstractResponse {

    private String[] transactions;

    public static AbstractResponse create(Hash[] transactions) {
        GetBulkTransactionsToApproveResponse res = new GetBulkTransactionsToApproveResponse();
        res.transactions = transactions;
        return res;
    }

    public String[] getTransactions() {
        return transactions;
    }
}
